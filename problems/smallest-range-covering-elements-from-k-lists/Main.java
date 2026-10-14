import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] nums = new int[][]{new int[]{4, 10, 15, 24, 26}, new int[]{0, 9, 12, 20}, new int[]{5, 18, 22, 30}};

            int[] result = sol.smallestRange(nums);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] nums = new int[][]{new int[]{1, 2, 3}, new int[]{1, 2, 3}, new int[]{1, 2, 3}};

            int[] result = sol.smallestRange(nums);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
