class MinCostToReachEnd {
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n == 1)
            return cost[0];
        if (n == 2)
            return Math.min(cost[0], cost[1]);
        int dp[] = new int[n + 1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[n - 2], dp[n - 1]);
    }

    public static void main(String[] args) {
        int[] cost = { 10, 15, 20 };
        System.out.println("Minimum cost to reach the top: " + minCostClimbingStairs(cost));
    }
}
