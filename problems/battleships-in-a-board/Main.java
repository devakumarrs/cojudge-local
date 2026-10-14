import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            char[][] board = new char[][]{new char[]{'X', '.', '.', 'X'}, new char[]{'.', '.', '.', 'X'}, new char[]{'.', '.', '.', 'X'}};

            int result = sol.countBattleships(board);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            char[][] board = new char[][]{new char[]{'X', '.'}, new char[]{'.', 'X'}};

            int result = sol.countBattleships(board);
            System.out.println("Example 2: " + result);
        }
    }
}
