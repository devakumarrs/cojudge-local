import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] board = new int[][]{new int[]{1, 2, 3}, new int[]{4, 0, 5}};

            int result = sol.slidingPuzzle(board);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] board = new int[][]{new int[]{1, 2, 3}, new int[]{5, 4, 0}};

            int result = sol.slidingPuzzle(board);
            System.out.println("Example 2: " + result);
        }
    }
}
