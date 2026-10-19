class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, area(grid, i, j, m, n));
                }
            }
        }
        return maxArea;
    }

    private int area(int[][] grid, int i, int j, int m, int n) {
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = 2;
        return 1 + area(grid, i + 1, j, m, n) + area(grid, i - 1, j, m, n) + area(grid, i, j + 1, m, n)
                + area(grid, i, j - 1, m, n);
    }
}