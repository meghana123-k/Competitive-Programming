import java.util.*;;

public class MinimizingCoins {
    static long[] dp;
    static long mod = 1000000007;

    // public static int helperRec(int[] a, int n, int tar) {
    // if (tar == 0)
    // return 0;
    // int min = Integer.MAX_VALUE;
    // for (int i = 0; i < n; i++) {
    // if (a[i] <= tar) {
    // min = Math.min(min, 1 + helperRec(a, n, tar - a[i]));
    // }
    // }
    // return min;
    // }

    // public static long helperMemo(long[] a, int n, long tar) {
    // if (tar == 0)
    // return 0;
    // if (dp[(int)tar] != -1)
    // return dp[(int)tar];
    // long min = Long.MAX_VALUE;
    // for (int i = 0; i < n; i++) {
    // if (a[i] <= tar) {
    // long res = helperMemo(a, n, tar - a[i]);
    // if(res != Long.MAX_VALUE) {
    // min = Math.min(min, res + 1);
    // }
    // }
    // }
    // return dp[(int)tar] = min;
    // }

    public static long helperTable(long[] a, int n, long tar) {
        long d[] = new long[(int) tar + 1];
        Arrays.fill(d, tar + 1L);
        d[0] = 0;
        for (long sum = 1; sum <= tar; sum++) {
            long min = Long.MAX_VALUE;
            for (long num : a) {
                if (num > sum) {
                    continue;
                }
                if (num <= sum && d[(int) (sum - num)] != tar + 1L) {
                    min = Math.min(min, 1 + d[(int) (sum - num)]);
                }

            }
            d[(int) sum] = min;
        }
        return d[(int) tar] == tar + 1L ? -1 : d[(int) tar];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
        }
        dp = new long[(int) t + 1];
        Arrays.fill(dp, -1);
        // int r1 = helperRec(a, n, t);
        // System.out.println(r1);
        // long r2 = helperMemo(a, n, t);
        // System.out.println(r2);
        long r3 = helperTable(a, n, t);
        // if (r3 == Long.MAX_VALUE) {
        //     System.out.println(-1);
        // } else {
            System.out.println(r3);
        // }
        sc.close();
    }
}
