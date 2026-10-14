import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] mat = new int[][]{new int[]{0, 0, 0}, new int[]{0, 1, 0}, new int[]{0, 0, 0}};

            int[][] result = sol.updateMatrix(mat);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] mat = new int[][]{new int[]{0, 0, 0}, new int[]{0, 1, 0}, new int[]{1, 1, 1}};

            int[][] result = sol.updateMatrix(mat);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
