import java.util.*;

class Solution {

    public int[][] permute(int[] nums) {
        List<int[]> results = new ArrayList<>();
        Set<Integer> set = new LinkedHashSet<>();
        permute(nums, set, results);
        return results.toArray(new int[0][]);
    }

    private void permute(int[] nums, Set<Integer> set, List<int[]> results) {
        if (set.size() == nums.length) {
            results.add(set.stream().mapToInt(Integer::intValue).toArray());
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                permute(nums, set, results);
                set.remove(nums[i]);
            }
        }
    }
}