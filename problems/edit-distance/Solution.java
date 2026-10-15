class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
        }
        for (int i = 1; i <= m; i++) {
            char ch1 = word1.charAt(i - 1);
            int pre = dp[0];
            dp[0] = i;
            for (int j = 1; j <= n; j++) {
                char ch2 = word2.charAt(j - 1);
                int temp = dp[j];
                if (ch1 == ch2) {
                    dp[j] = pre;
                } else {
                    dp[j] = 1 + Math.min(dp[j], Math.min(pre, dp[j - 1]));
                }
                pre = temp;
            }
        }

        return dp[n];
    }
}