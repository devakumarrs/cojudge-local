import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] image = new int[][]{new int[]{1, 1, 0}, new int[]{1, 0, 1}, new int[]{0, 0, 0}};

            int[][] result = sol.flipAndInvertImage(image);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] image = new int[][]{new int[]{1, 1, 0, 0}, new int[]{1, 0, 0, 1}, new int[]{0, 1, 1, 1}, new int[]{1, 0, 1, 0}};

            int[][] result = sol.flipAndInvertImage(image);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
