import java.util.*;

class Solution {
    public int[][] threeSum(int[] nums) {
        int n = nums.length;
        List<int[]> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int target = -nums[i];
                int sum = nums[j] + nums[k];
                if (sum < target) {
                    j++;
                } else if (sum > target) {
                    k--;
                } else {
                    result.add(new int[] { nums[i], nums[j], nums[k] });
                    while (k > i + 1 && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    while (j < n - 1 && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    j++;
                    k--;
                }
            }
            while (i < n - 2 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return result.toArray(new int[0][]);
    }
}