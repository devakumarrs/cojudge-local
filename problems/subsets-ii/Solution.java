import java.util.*;

class Solution {
    List<Integer> current;
    List<int[]> all;

    public int[][] subsetsWithDup(int[] nums) {
        current = new LinkedList<>();
        all = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0);
        return all.toArray(new int[0][]);
    }

    private void backtrack(int[] nums, int index) {
        if (index == nums.length) {
            all.add(current.stream().mapToInt(Integer::intValue).toArray());
            return;
        }
        current.add(nums[index]);
        backtrack(nums, index + 1);
        current.remove(current.size() - 1);
        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }
        backtrack(nums, index + 1);
    }
}