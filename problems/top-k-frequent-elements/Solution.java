import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int n = nums.length;
        List<List<Integer>> freq = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            freq.add(new ArrayList<>());
        }
        for (var entry : map.entrySet()) {
            freq.get(entry.getValue() - 1).add(entry.getKey());
        }
        int[] result = new int[k];
        for (int i = n - 1; i >= 0; i--) {
            int j = 0;
            while (k > 0 && j < freq.get(i).size()) {
                result[k - 1] = freq.get(i).get(j);
                k--;
                j++;
            }
            if (k == 0)
                break;
        }
        return result;
    }
}