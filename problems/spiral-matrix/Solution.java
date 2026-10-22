class Solution {
    public int[] spiralOrder(int[][] matrix) {
        int left, right, top, bottom;
        left = top = 0;
        bottom = matrix.length;
        right = matrix[0].length;
        int[] result = new int[bottom * right];
        int i, j, k;
        i = j = k = 0;
        while (k < result.length) {
            while (j < right) {
                result[k++] = matrix[i][j++];
            }
            if (k == result.length) {
                break;
            }
            j--;
            i++;
            top++;
            while (i < bottom) {
                result[k++] = matrix[i++][j];
            }
            if (k == result.length) {
                break;
            }
            i--;
            j--;
            right--;
            while (j >= left) {
                result[k++] = matrix[i][j--];
            }
            if (k == result.length) {
                break;
            }
            j++;
            i--;
            bottom--;
            while (i >= top) {
                result[k++] = matrix[i--][j];
            }
            i++;
            j++;
            left++;
        }
        return result;
    }
}