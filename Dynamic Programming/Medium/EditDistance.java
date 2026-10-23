import java.util.Arrays;
import java.util.Scanner;

public class EditDistance {
    static long dp[][];
    static final long MOD = 1000000007L;

    public static long helperMemo(String s1, String s2, int i, int j) {
        if (i < 0 && j < 0)
            return 0;
        if (i < 0)
            return j + 1;
        if (j < 0)
            return i + 1;
        if (dp[i][j] != -1)
            return dp[i][j];
        long add = Integer.MAX_VALUE;
        long sub = Integer.MAX_VALUE;
        long rep = Integer.MAX_VALUE;
        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = helperMemo(s1, s2, i - 1, j - 1);
        } else {
            add = helperMemo(s1, s2, i, j - 1);
            sub = helperMemo(s1, s2, i - 1, j);
            rep = helperMemo(s1, s2, i - 1, j - 1);
            return dp[i][j] = (1 + Math.min(add, Math.min(sub, rep))) % MOD;
        }
    }

    public static long helperTable(String s1, String s2, int n, int m) {
        long[][] fn = new long[n + 1][m + 1];
        long add = Long.MAX_VALUE;
        long sub = Long.MAX_VALUE;
        long rep = Long.MAX_VALUE;
        fn[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            fn[i][0] = i;
        }
        for (int i = 1; i <= m; i++) {
            fn[0][i] = i;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    fn[i][j] = fn[i - 1][j - 1];
                } else {
                    add = fn[i][j - 1];
                    sub = fn[i - 1][j];
                    rep = fn[i - 1][j - 1];
                    fn[i][j] = 1 + Math.min(add, Math.min(sub, rep));
                }
            }
        }
        return fn[n][m];
        // if(s1.charAt(i) == s2.charAt(j)) {
        // return dp[i][j] = helperMemo(s1, s2, i-1, j-1);
        // } else {
        // add = helperMemo(s1, s2, i, j-1);
        // sub = helperMemo(s1, s2, i-1, j);
        // rep = helperMemo(s1, s2, i-1, j-1);
        // return dp[i][j] = (1 + Math.min(add, Math.min(sub, rep))) % MOD;
        // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        dp = new long[s1.length()][s2.length()];
        for (long[] d : dp) {
            Arrays.fill(d, -1);
        }
        // long res = helperMemo(s1, s2, s1.length() - 1, s2.length() - 1);
        // System.out.println(res);
        long res = helperTable(s1, s2, s1.length(), s2.length());
        System.out.println(res);
        sc.close();
    }
}
