class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[] pre = new int[n + 1];
        int[] curr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            pre[i] = i;
        }
        for (int i = 1; i <= m; i++) {
            char ch1 = word1.charAt(i - 1);
            curr[0] = i;
            for (int j = 1; j <= n; j++) {
                char ch2 = word2.charAt(j - 1);
                if (ch1 == ch2) {
                    curr[j] = pre[j - 1];
                } else {
                    curr[j] = 1 + Math.min(pre[j], Math.min(pre[j - 1], curr[j - 1]));
                }
            }
            int[] temp = pre;
            pre = curr;
            curr = temp;
        }

        // Don't forget the last swap
        return pre[n];
    }
}