import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            char[][] board = new char[][]{new char[]{'0', '1', '1', '0'}, new char[]{'0', '1', '1', '0'}, new char[]{'1', '0', '0', '1'}, new char[]{'1', '0', '0', '1'}};

            int result = sol.movesToChessboard(board);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            char[][] board = new char[][]{new char[]{'0', '1'}, new char[]{'1', '0'}};

            int result = sol.movesToChessboard(board);
            System.out.println("Example 2: " + result);
        }
    }
}
