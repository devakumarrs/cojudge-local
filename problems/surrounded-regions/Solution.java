import java.util.*;

class Solution {
    public List<String> solve(String[] board) {
        int m = board.length;
        int n = board[0].length();
        char[][] maze = new char[m][];
        for (int i = 0; i < m; i++) {
            maze[i] = board[i].toCharArray();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || j == 0 || i == m - 1 || j == n - 1) && board[i].charAt(j) == 'O') {
                    solve(maze, i, j, m, n);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (maze[i][j] == 'O') {
                    maze[i][j] = 'X';
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (maze[i][j] == 'Y') {
                    maze[i][j] = 'O';
                }
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            result.add(new String(maze[i]));
        }
        return result;
    }

    private void solve(char[][] maze, int i, int j, int m, int n) {
        if (i < 0 || j < 0 || i >= m || j >= n || maze[i][j] != 'O') {
            return;
        }
        maze[i][j] = 'Y';
        solve(maze, i + 1, j, m, n);
        solve(maze, i - 1, j, m, n);
        solve(maze, i, j - 1, m, n);
        solve(maze, i, j + 1, m, n);
    }
}
