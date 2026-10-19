import java.util.*;

class Solution {

    public int[][] permute(int[] nums) {
        List<int[]> results = new ArrayList<>();
        permute(nums, 0, results);
        return results.toArray(new int[0][]);
    }

    private void permute(int[] nums, int start, List<int[]> results) {
        if (start == nums.length) {
            int[] arr = new int[nums.length];
            System.arraycopy(nums, 0, arr, 0, nums.length);
            results.add(arr);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            permute(nums, start + 1, results);
            swap(nums, i, start);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}