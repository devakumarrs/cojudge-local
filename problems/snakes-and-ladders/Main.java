import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] board = new int[][]{new int[]{-1, -1, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, -1, -1}, new int[]{-1, 35, -1, -1, 13, -1}, new int[]{-1, -1, -1, -1, -1, -1}, new int[]{-1, 15, -1, -1, -1, -1}};

            int result = sol.snakesAndLadders(board);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] board = new int[][]{new int[]{-1, -1}, new int[]{-1, 3}};

            int result = sol.snakesAndLadders(board);
            System.out.println("Example 2: " + result);
        }
    }
}
