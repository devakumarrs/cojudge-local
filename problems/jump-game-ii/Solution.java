class Solution {
    public int jump(int[] nums) {
        int current = 0;
        int dist = 0;
        int next = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > current) {
                current = next;
                dist++;
            }
            next = Math.max(next, i + nums[i]);
        }
        return dist;
    }
}