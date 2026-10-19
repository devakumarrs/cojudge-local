class Solution {
    public String longestPalindrome(String s) {
        int startIndex = 0, maxLen = 1;
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = true;
            for (int j = i + 1; j < n; j++) {
                int len = j - i + 1;
                dp[i][j] = s.charAt(i) == s.charAt(j) && (len == 2 ? true : dp[i + 1][j - 1]);
                if (dp[i][j] && len > maxLen) {
                    startIndex = i;
                    maxLen = len;
                }
            }
        }
        return s.substring(startIndex, startIndex + maxLen);
    }
}