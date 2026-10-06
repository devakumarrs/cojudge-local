class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && exist(board, word, i, j, m, n, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] board, String word, int i, int j, int m, int n, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] == '#' || word.charAt(index) != board[i][j]) {
            return false;
        }

        char ch = board[i][j];
        board[i][j] = '#';
        boolean doesExist = exist(board, word, i + 1, j, m, n, index + 1)
                || exist(board, word, i, j + 1, m, n, index + 1) || exist(board, word, i, j - 1, m, n, index + 1)
                || exist(board, word, i - 1, j, m, n, index + 1);
        board[i][j] = ch;
        return doesExist;
    }
}