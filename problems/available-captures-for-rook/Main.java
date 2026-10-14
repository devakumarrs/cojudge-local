import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            char[][] board = new char[][]{new char[]{'R', '.', '.', '.', '.', '.', '.', '.'}, new char[]{'B', '.', '.', '.', '.', '.', '.', '.'}, new char[]{'.', '.', '.', '.', '.', '.', '.', '.'}, new char[]{'.', '.', '.', '.', '.', '.', '.', '.'}, new char[]{'.', '.', '.', '.', '.', '.', '.', '.'}, new char[]{'.', '.', '.', '.', '.', '.', '.', '.'}, new char[]{'.', '.', '.', '.', '.', '.', '.', '.'}, new char[]{'p', '.', '.', '.', '.', '.', '.', '.'}};

            int result = sol.numRookCaptures(board);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            char[][] board = new char[][]{new char[]{'p', '.', '.', '.', '.', '.', '.', '.'}, new char[]{'.', '.', '.', 'p', '.', '.', '.', '.'}, new char[]{'.', '.', '.', 'R', '.', '.', '.', 'p'}, new char[]{'.', '.', '.', '.', '.', '.', '.', '.'}, new char[]{'.', '.', '.', '.', '.', '.', '.', '.'}, new char[]{'.', '.', '.', 'p', '.', '.', '.', '.'}, new char[]{'.', '.', '.', '.', '.', '.', '.', '.'}, new char[]{'.', '.', '.', '.', '.', '.', '.', '.'}};

            int result = sol.numRookCaptures(board);
            System.out.println("Example 2: " + result);
        }
    }
}
