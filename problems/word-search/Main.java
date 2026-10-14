import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            char[][] board = new char[][]{new char[]{'A', 'B', 'C', 'E'}, new char[]{'S', 'F', 'C', 'S'}, new char[]{'A', 'D', 'E', 'E'}};
            String word = "ABCCED";

            boolean result = sol.exist(board, word);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            char[][] board = new char[][]{new char[]{'A', 'B', 'C', 'E'}, new char[]{'S', 'F', 'C', 'S'}, new char[]{'A', 'D', 'E', 'E'}};
            String word = "SEE";

            boolean result = sol.exist(board, word);
            System.out.println("Example 2: " + result);
        }
    }
}
