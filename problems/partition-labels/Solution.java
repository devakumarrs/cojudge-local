import java.util.*;

class Solution {
    public int[] partitionLabels(String s) {
        int[] lastOccurrence = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }
        int start = 0, end = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int last = lastOccurrence[s.charAt(i) - 'a'];
            if (i > end) {
                result.add(end - start + 1);
                start = i;
                end = last;
            } else {
                end = Math.max(end, last);
            }
        }
        result.add(end - start + 1);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}