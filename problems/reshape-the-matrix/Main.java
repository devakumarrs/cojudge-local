import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] mat = new int[][]{new int[]{1, 2}, new int[]{3, 4}};
            int r = 1;
            int c = 4;

            int[][] result = sol.matrixReshape(mat, r, c);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] mat = new int[][]{new int[]{1, 2}, new int[]{3, 4}};
            int r = 2;
            int c = 4;

            int[][] result = sol.matrixReshape(mat, r, c);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
