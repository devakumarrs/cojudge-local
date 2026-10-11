class Solution {
    public boolean isValidSudoku(String[] board) {
        boolean[][][] visited = new boolean[3][9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i].charAt(j);
                if (ch == '.')
                    continue;
                int val = ch - '1';
                int box = (3 * (i / 3)) + j / 3;
                if (visited[0][i][val] || visited[1][j][val] || visited[2][box][val]) {
                    return false;
                }
                visited[0][i][val] = true;
                visited[1][j][val] = true;
                visited[2][box][val] = true;
            }
        }
        return true;
    }
}
