import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] forest = new int[][]{new int[]{1, 2, 3}, new int[]{0, 0, 4}, new int[]{7, 6, 5}};

            int result = sol.cutOffTree(forest);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] forest = new int[][]{new int[]{1, 2, 3}, new int[]{0, 0, 0}, new int[]{7, 6, 5}};

            int result = sol.cutOffTree(forest);
            System.out.println("Example 2: " + result);
        }
    }
}
