import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] image = new int[][]{new int[]{1, 1, 1}, new int[]{1, 1, 0}, new int[]{1, 0, 1}};
            int sr = 1;
            int sc = 1;
            int color = 2;

            int[][] result = sol.floodFill(image, sr, sc, color);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] image = new int[][]{new int[]{0, 0, 0}, new int[]{0, 0, 0}};
            int sr = 0;
            int sc = 0;
            int color = 0;

            int[][] result = sol.floodFill(image, sr, sc, color);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
