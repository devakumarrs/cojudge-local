class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[low] <= nums[mid]) {
                if (mid + 1 <= high && nums[mid + 1] <= nums[high]) {
                    return Math.min(nums[low], nums[mid + 1]);
                } else {
                    low = mid + 1;
                }
            } else {
                high = mid;
            }
        }
        return nums[high];
    }
}