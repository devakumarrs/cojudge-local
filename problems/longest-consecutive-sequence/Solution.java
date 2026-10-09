import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxLen = 0;
        for (int num : nums) {
            if (!set.contains(num)) {
                continue;
            }
            int i = 1;
            int len = 1;
            while (set.contains(num + i)) {
                set.remove(num + i);
                len++;
                i++;
            }
            i = 1;
            while (set.contains(num - i)) {
                set.remove(num - i);
                len++;
                i++;
            }
            if (len > maxLen) {
                maxLen = len;
            }
        }
        return maxLen;
    }
}