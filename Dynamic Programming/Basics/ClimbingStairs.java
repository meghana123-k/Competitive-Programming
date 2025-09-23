
class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1; // 1 way to stay at the ground (do nothing)
        dp[1] = 1; // 1 way to climb 1 stair

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // Sum of ways to reach the last step and the step before that
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Number of ways to climb " + n + " stairs: " + climbStairs(n));
    }    
}
