class Solution {
    public int change(int amount, int[] coins) {
        int m = coins.length;
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = coins[i - 1]; j <= amount; j++) {
                dp[j] += dp[j - coins[i - 1]];
            }
        }
        return dp[amount];
    }
}