import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            char[][] board = new char[][]{new char[]{'E', 'E', 'E', 'E', 'E'}, new char[]{'E', 'E', 'M', 'E', 'E'}, new char[]{'E', 'E', 'E', 'E', 'E'}, new char[]{'E', 'E', 'E', 'E', 'E'}};
            int[] click = new int[]{3, 0};

            List<String> result = sol.updateBoard(board, click);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            char[][] board = new char[][]{new char[]{'B', '1', 'E', '1', 'B'}, new char[]{'B', '1', 'M', '1', 'B'}, new char[]{'B', '1', '1', '1', 'B'}, new char[]{'B', 'B', 'B', 'B', 'B'}};
            int[] click = new int[]{1, 2};

            List<String> result = sol.updateBoard(board, click);
            System.out.println("Example 2: " + result);
        }
    }
}
