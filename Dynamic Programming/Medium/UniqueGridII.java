
import java.util.Scanner;

public class UniqueGridII {
    static final long MOD = 1000000007L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] str = new String[n];
        for(int i = 0; i < n; i++) {
            str[i] = sc.nextLine().trim();
        }
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(str[i].charAt(j) == '*') {
                    a[i][j] = 0;
                } else {
                    a[i][j] = 1;
                }
                // System.out.print(a[i][j]+" ");
            }
            // System.out.println();
        }
        long dp[][] = new long[n][n];
        int i = 0;
        while(i < n) {
            if(a[i][0] == 0) {
                break;
            }
            dp[i][0] = 1;
            i++;
        }
        while (i < n) {
            dp[i][0] = 0;
            i++;
        }
        int j = 0;
        while(j < n) {
            if(a[0][j] == 0) {
                break;
            }
            dp[0][j] = 1;
            j++;
        }
        while (j < n) {
            dp[0][j] = 0;
            j++;
        }
        // System.out.println();
        for(int k = 1; k < n; k++) {
            for(int l = 1; l < n; l++) {
                if(a[k][l] != 0) {
                    dp[k][l] = (dp[k-1][l] + dp[k][l-1]) % MOD;
                }
                // System.out.print(dp[k][l]+" ");
            }
            // System.out.println();
        }
        System.out.println(dp[n-1][n-1]);
        sc.close();
    }
}
