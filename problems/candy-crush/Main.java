import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            char[][] board = new char[][]{new char[]{'1', '1', '1', '2'}, new char[]{'1', '3', '2', '2'}, new char[]{'1', '2', '3', '1'}};

            List<String> result = sol.candyCrush(board);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            char[][] board = new char[][]{new char[]{'1', '2', '3'}, new char[]{'4', '5', '6'}};

            List<String> result = sol.candyCrush(board);
            System.out.println("Example 2: " + result);
        }
    }
}
