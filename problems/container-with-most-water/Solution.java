class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int area;
            if (height[i] > height[j]) {
                area = height[j] * (j - i);
                j--;
            } else if (height[i] < height[j]) {
                area = height[i] * (j - i);
                i++;
            } else {
                area = height[j] * (j - i);
                i++;
                j--;
            }
            if (area > result) {
                result = area;
            }
        }
        return result;
    }
}