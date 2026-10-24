import java.util.*;
public class SlidingWindowSum {
    static final long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] ip = new long[4];
        for(int i = 0; i < 4; i++) {
            ip[i] = sc.nextLong();
        }
        long[] a = new long[n];
        a[0] = ip[0];
        for (int i = 1; i < 8; i++) {
            a[i] = ((((ip[1] % MOD * a[i-1] % MOD) % MOD  + ip[2]) %MOD) % ip[3]) % MOD;
        } 
        int i = 0; int j = 0;
        long ans = 0, sum = 0;
        while (i < n && j < n) {
            sum = (sum + a[j]) % MOD;
            if(j-i+1 == k) {
                ans ^= sum;
                sum = (sum - a[i]) % MOD;
                i++;
            }
            j++;
        }
        System.out.println(ans);
        sc.close();
    }
}