import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] rects = new int[][]{new int[]{-2, -2, 1, 1}, new int[]{2, 2, 4, 6}};

            int[] result = sol.pickPoint(rects);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] rects = new int[][]{new int[]{0, 0, 0, 0}};

            int[] result = sol.pickPoint(rects);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
