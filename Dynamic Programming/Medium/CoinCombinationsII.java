import java.util.*;;

public class CoinCombinationsII {
    static long mod = 1000000007;

    public static int helperRec(int[] a, int n, int tar) {
        if (tar == 0)
            return 1;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] <= tar) {
                cnt += (helperRec(a, n, tar - a[i]));
            }
        }
        return cnt;
    }

    // public static int helperMemo(int[] a, int n, int tar) {
    // if (dp[n] != -1)
    // return dp[n];
    // if (tar == 0)
    // return 1;
    // int cnt = 0;
    // for (int i = 0; i < n; i++) {
    // if (a[i] <= tar) {
    // cnt += (helperRec(a, n, tar - a[i]));
    // }
    // }
    // return dp[n] = cnt;
    // }

    // public static long helperTable(long[] a, int n, int tar) {
    //     long[] d = new long[tar + 1];
    //     d[0] = 1;
    //     for (int j = 1; j <= tar; j++) {
    //         int ways = 0;
    //         for (int i = 0; i < n; i++) {
    //             if (a[i] > j) {
    //                 continue;
    //             }
    //             ways += d[j - (int) a[i]];
    //             if (ways >= mod) {
    //                 ways -= mod;
    //             }
    //             d[j] = ways;
    //         }
    //     }
    //     return d[tar];
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        // dp = new int[n + 1];
        // Arrays.fill(dp, -1);
        int r1 = helperRec(a, n, t);
        System.out.println(r1);
        // int r2 = helperMemo(a, n, t);
        // System.out.println(r2);
        // long r3 = helperTable(a, n, t);
        // System.out.println(r1);
        sc.close();
    }
}
