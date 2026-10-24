import java.util.Arrays;
import java.util.Scanner;

public class RemovalGame {
    static long dp[][];

    public static long helper(long[] a, int i, int j, int n) {
        if (i > j)
            return 0;
        if (i >= n)
            return 0;
        if (j < 0)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        return dp[i][j] = Math.max(a[i] - helper(a, i + 1, j, n), a[j] - helper(a, i, j - 1, n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
        }
        dp = new long[n][n];
        for (long[] d : dp) {
            Arrays.fill(d, -1);
        }
        long res = helper(a, 0, n - 1, n);
        long ans = ((sum + res) / 2);
        System.out.println(ans);
        sc.close();
    }
}
