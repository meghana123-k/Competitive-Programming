import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        int a = 0;
        while (a < n && ch[a][0] != '*') {
            a++;
        }
        while (a < n) {
            dp[a][0] = -1;
        }
        int b = 0;
        while (b < n && ch[0][b] != '*') {
            b++;
        }
        while (b < n) {
            dp[0][b] = -1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (ch[i][j] == '*') {
                    dp[i][j] = -1;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (dp[i][j] != -1) {
                    if (dp[i - 1][j] != -1) {
                        dp[i][j] += dp[i - 1][j];
                    }
                    if (dp[i][j - 1] != -1) {
                        dp[i][j] += dp[i][j - 1];
                    }
                }
            }
        }
        System.out.println(dp[n - 1][n - 1]);
        sc.close();
    }
}
