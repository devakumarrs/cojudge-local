class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            char current = s.charAt(i);
            if (current != '0') {
                dp[i] = dp[i + 1];
                if (i + 1 < n) {
                    char next = s.charAt(i + 1);
                    int val = 10 * (current - '0') + (next - '0');
                    if (val >= 10 && val <= 26) {
                        dp[i] += dp[i + 2];
                    }
                }
            }
        }
        return dp[0];
    }
}