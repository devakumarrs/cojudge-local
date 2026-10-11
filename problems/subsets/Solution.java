import java.util.*;

class Solution {
    List<int[]> results;
    List<Integer> result;

    public int[][] subsets(int[] nums) {
        result = new ArrayList<>();
        results = new ArrayList<>();
        helper(nums, 0);
        return results.toArray(new int[0][]);
    }

    private void helper(int[] nums, int index) {
        if (index == nums.length) {
            results.add(result.stream().mapToInt(Integer::intValue).toArray());
            return;
        }
        result.add(nums[index]);
        helper(nums, index + 1);
        result.remove(result.size() - 1);
        helper(nums, index + 1);
    }
}
