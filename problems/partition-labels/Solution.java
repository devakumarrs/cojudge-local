import java.util.*;

class Solution {
    public int[] partitionLabels(String s) {
        Map<Character, int[]> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int[] arr = map.getOrDefault(ch, new int[] { i, i });
            arr[1] = i;
            map.put(ch, arr);
        }
        int[] last = new int[] { 0, 0 };
        List<Integer> result = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (!map.containsKey(ch)) {
                continue;
            }
            int[] current = map.get(ch);
            if (current[0] > last[1]) {
                result.add(last[1] - last[0] + 1);
                last = current;
            } else {
                last[1] = Math.max(last[1], current[1]);
            }
            map.remove(ch);
        }
        result.add(last[1] - last[0] + 1);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}