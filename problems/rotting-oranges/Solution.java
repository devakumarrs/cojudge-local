import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] dir = new int[][] {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        Deque<int[]> q = new ArrayDeque<>();
        int freshCount = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    freshCount++;
                } else if (grid[i][j] == 2) {
                    q.offer(new int[] {i, j});
                }
            }
        }
        int minutes = 0;
        while (!q.isEmpty() && freshCount > 0) {
            int size = q.size();
            minutes++;
            for (int i = 0; i < size; i++) {
                int[] point = q.poll();
                for (int j = 0; j < 4; j++) {
                    int x = point[0] + dir[j][0];
                    int y = point[1] + dir[j][1];
                    if (x < 0 || x >= m || y < 0 || y >= n) {
                        continue;
                    }
                    if (grid[x][y] == 1) {
                        grid[x][y] = 2;
                        freshCount--;
                        q.offer(new int[] {x, y});
                    }
                }
            }
        }
        return freshCount > 0 ? -1 : minutes;
    }
}
