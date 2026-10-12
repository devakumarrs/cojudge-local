import java.util.*;

class Solution {
    char[][] board;
    List<List<String>> results;
    int n;

    public List<List<String>> solveNQueens(int n) {
        board = new char[n][n];
        results = new ArrayList<>();
        this.n = n;
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        helper(0);
        return results;
    }

    private void helper(int row) {
        if (row == n) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                result.add(new String(board[i]));
            }
            results.add(result);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(row, i)) {
                board[row][i] = 'Q';
                helper(row + 1);
                board[row][i] = '.';
            }
        }
    }

    private boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; j >= 0 && i >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
