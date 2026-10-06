class Solution {
    public int maxSubArray(int[] nums) {
        int lm, gm;
        lm = gm = nums[0];
        for (int i = 1; i < nums.length; i++) {
            lm = Math.max(nums[i], lm + nums[i]);
            gm = Math.max(gm, lm);
        }
        return gm;
    }
}