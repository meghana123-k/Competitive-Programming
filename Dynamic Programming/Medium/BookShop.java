
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BookShop {
    // static final long MOD = 1000000007;
    static long dp[][];

    // public static long helperRec(long[] price, long[] pages, int money, int idx)
    // {
    // if (idx < 0 || money < 0)
    // return 0;
    // if(dp[idx][money] != -1) return dp[idx][money];
    // long notTake = helperRec(price, pages, money, idx - 1);
    // long take = 0;
    // if (pages[idx] <= money) {
    // // System.out.print(sum+" "+money+" ");
    // take = (helperRec(price, pages, (int)(money - price[idx]), idx - 1) +
    // pages[idx]) % MOD;
    // }
    // return dp[idx][money] = Math.max(take, notTake);
    // }
    public static void helperTable(long[] price, long[] pages, int money, int n) {
        long fn[] = new long[money + 1];

        for (int p = 0; p < n; p++) {
            for (int mon = money; mon >= price[p]; mon--) {
                long take = 0;
                if (price[p] <= mon) {
                    take = fn[(int) (mon - price[p])] + pages[p];
                }
                long notTake = fn[mon];
                fn[mon] = Math.max(take, notTake);
            }
        }

        // for(int p = 0; p <= n; p++) {
        // for(int mon = 0; mon <= money; mon++) {
        // System.out.print(fn[p][mon]+ " ");
        // }
        // System.out.println();
        // }
        System.out.println(fn[money]);
    }

    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ip = br.readLine().trim().split(" ");
        int n = Integer.parseInt(ip[0]);
        int m = Integer.parseInt(ip[1]);
        long[] price = new long[n];
        long[] pages = new long[n];
        String pr[] = br.readLine().trim().split(" ");
        String pg[] = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(pr[i]);
        }
        for (int i = 0; i < n; i++) {
            pages[i] = Integer.parseInt(pg[i]);
        }
        // dp = new long[n][m + 1];
        // for (long[] d : dp) {
        //     Arrays.fill(d, -1);
        // }
        // long res = helperRec(price, pages, m, n - 1);
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= m; j++) {
        // System.out.print(dp[i][j]+" ");
        // }
        // System.out.println();
        // }
        // System.out.println(res);
        helperTable(price, pages, m, n);
    }
}
