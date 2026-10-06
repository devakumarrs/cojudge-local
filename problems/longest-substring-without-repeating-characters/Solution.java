import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int i = 0, j = 0;
        Set<Character> set = new HashSet<Character>();
        while (j < s.length()) {
            char c = s.charAt(j);
            while (set.contains(c)) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, j - i + 1);
            j++;
        }
        return maxLen;

    }
}