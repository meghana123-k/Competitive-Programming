import java.util.*;;

public class DiceCombinations {
    static final long mod = 1_000_000_007L;
    static int dp[];
    public static long dpRecursion(int n) {
        long cnt = 0;
        if(n == 0) return 1;
        for(int i = 1; i <= 6 && (n-i) >= 0; i++) {
            cnt = (cnt + dpRecursion(n-i)) % mod;
        }
        return cnt;
    }
    public static int dpTable(int n) {
        int d[] = new int[n+1];
        d[0] = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 6; j++) {
                if(i-j >= 0) {
                    d[i] =  (int) ((d[i] + (long) d[i-j]) % mod);
                }
            }
        }
        return d[n];
    }
    public static long dpMemo(int n) {
        long cnt = 0;
        if(dp[n] != -1) return dp[n];
        if(n == 0) return 1;
        for(int i = 1; i <= 6 && (n-i) >= 0; i++) {
            cnt = (cnt + dpRecursion(n-i)) % mod;
        }
        return dp[n] = (int)cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        long r1 = dpRecursion(n);
        System.out.println(r1);
        int r2 = dpTable(n);
        System.out.println(r2);
        long r3 = dpMemo(n);
        System.out.println(r3);
        sc.close();
    }
}
