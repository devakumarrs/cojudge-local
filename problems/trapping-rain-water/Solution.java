class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] rMax = new int[n];
        int max = height[n - 1];
        rMax[n - 1] = max;
        for (int i = n - 2; i >= 0; i--) {
            max = Math.max(max, height[i]);
            rMax[i] = max;
        }
        max = height[0];
        int vol = 0;
        for (int i = 1; i < n; i++) {
            max = Math.max(max, height[i]);
            vol += Math.max(0, Math.min(max, rMax[i]) - height[i]);
        }
        return vol;
    }
}