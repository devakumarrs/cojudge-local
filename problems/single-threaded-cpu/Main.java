import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] tasks = new int[][]{new int[]{1, 2}, new int[]{2, 4}, new int[]{3, 2}, new int[]{4, 1}};

            int[] result = sol.getOrder(tasks);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] tasks = new int[][]{new int[]{7, 10}, new int[]{7, 12}, new int[]{7, 5}, new int[]{7, 4}, new int[]{7, 2}};

            int[] result = sol.getOrder(tasks);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
