import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] richer = new int[][]{new int[]{1, 0}, new int[]{2, 1}, new int[]{3, 1}, new int[]{3, 7}, new int[]{4, 2}, new int[]{5, 3}, new int[]{6, 3}};
            int[] quiet = new int[]{3, 2, 5, 4, 6, 1, 7, 0};

            int[] result = sol.loudAndRich(richer, quiet);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] richer = new int[][]{};
            int[] quiet = new int[]{0};

            int[] result = sol.loudAndRich(richer, quiet);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
