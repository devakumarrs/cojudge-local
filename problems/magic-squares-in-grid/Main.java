import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] grid = new int[][]{new int[]{4, 3, 8, 4}, new int[]{9, 5, 1, 9}, new int[]{2, 7, 6, 2}};

            int result = sol.numMagicSquaresInside(grid);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] grid = new int[][]{new int[]{8}};

            int result = sol.numMagicSquaresInside(grid);
            System.out.println("Example 2: " + result);
        }
    }
}
