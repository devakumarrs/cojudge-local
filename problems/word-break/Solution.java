import java.util.*;

class Solution {
    public boolean wordBreak(String s, String[] wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[n] = true;
        Set<String> wordSet = new HashSet<>(Arrays.asList(wordDict));
        for (int i = n; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (dp[i] && !dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[j] = true;
                }
            }
        }
        return dp[0];
    }
}