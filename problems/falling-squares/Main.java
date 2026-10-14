import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] positions = new int[][]{new int[]{1, 2}, new int[]{2, 3}, new int[]{6, 1}};

            int[] result = sol.fallingSquares(positions);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] positions = new int[][]{new int[]{100, 100}, new int[]{200, 100}};

            int[] result = sol.fallingSquares(positions);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
