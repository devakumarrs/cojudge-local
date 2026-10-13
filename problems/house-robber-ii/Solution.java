class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        return Math.max(rob(nums, 0, n - 2), rob(nums, 1, n - 1));
    }

    private int rob(int[] nums, int start, int end) {
        if (start > end) {
            return 0;
        }
        int a = 0, b = nums[start];
        for (int i = start + 1; i <= end; i++) {
            int c = Math.max(a + nums[i], b);
            a = b;
            b = c;
        }
        return b;
    }
}