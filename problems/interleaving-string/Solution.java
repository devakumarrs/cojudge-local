import java.util.*;

class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length(), n = s2.length(), p = s3.length();
        if (p != m + n) {
            return false;
        }
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int j = 1; j <= n; j++) {
            dp[j] = dp[j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                int k = i + j;
                dp[j] = (s1.charAt(i - 1) == s3.charAt(k - 1) && dp[j])
                        || (j > 0 && s2.charAt(j - 1) == s3.charAt(k - 1) && dp[j - 1]);
            }
        }
        return dp[n];
    }
}