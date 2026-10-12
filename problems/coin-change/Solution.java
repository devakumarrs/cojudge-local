class Solution {
    public int coinChange(int[] coins, int amount) {
        int m = coins.length;
        int n = amount;
        // int[][] dp = new int[m + 1][n + 1];
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // dp[0][i] = Integer.MAX_VALUE - 1;
            dp[i] = Integer.MAX_VALUE - 1;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = coins[i - 1]; j <= n; j++) {
                // dp[i][j] = dp[i - 1][j];
                // if (coins[i - 1] <= j) {
                // dp[i][j] = Math.min(dp[i][j], 1 + dp[i][j - coins[i - 1]]);
                dp[j] = Math.min(dp[j], 1 + dp[j - coins[i - 1]]);
                // }
            }
        }
        return dp[n] == Integer.MAX_VALUE - 1 ? -1 : dp[n];
    }
}
