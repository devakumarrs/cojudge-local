import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] triplets = new int[][]{new int[]{2, 5, 3}, new int[]{1, 8, 4}, new int[]{1, 7, 5}};
            int[] target = new int[]{2, 7, 5};

            boolean result = sol.mergeTriplets(triplets, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] triplets = new int[][]{new int[]{3, 4, 5}, new int[]{4, 5, 6}};
            int[] target = new int[]{3, 2, 5};

            boolean result = sol.mergeTriplets(triplets, target);
            System.out.println("Example 2: " + result);
        }
    }
}
