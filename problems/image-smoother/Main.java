import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] img = new int[][]{new int[]{1, 1, 1}, new int[]{1, 0, 1}, new int[]{1, 1, 1}};

            int[][] result = sol.imageSmoother(img);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] img = new int[][]{new int[]{100, 200, 100}, new int[]{200, 50, 200}, new int[]{100, 200, 100}};

            int[][] result = sol.imageSmoother(img);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
