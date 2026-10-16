class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (target > sum || target < -sum) {
            return 0;
        }
        int[][] dp = new int[n + 1][2 * sum + 1];
        dp[0][sum] = 1;
        int reach = 0;
        for (int i = 1; i <= n; i++) {
            int offset = nums[i - 1];
            for (int j = -reach; j <= reach; j++) {
                dp[i][j + sum + offset] += dp[i - 1][j + sum];
                dp[i][j + sum - offset] += dp[i - 1][j + sum];
            }
            reach += offset;
        }
        return dp[n][target + sum];
    }
}