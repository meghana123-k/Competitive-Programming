class NoOfChanges {
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int amount = 5;
        int[] dp = new int[amount + 1];

        // Base case: 1 way to make amount 0 (use nothing)
        dp[0] = 1;

        // Loop over each coin
        for (int coin : coins) {
            // Update dp for all amounts >= coin
            for (int j = coin; j <= amount; j++) {
                dp[j] += dp[j - coin];
            }
        }

        System.out.println(dp[amount]); // Output the number of ways to make the amount 4
    }
}
