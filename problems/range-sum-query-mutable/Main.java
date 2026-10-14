import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 3, 5};
            String[] operations = new String[]{"sumRange", "update", "sumRange"};
            int[][] values = new int[][]{new int[]{0, 2}, new int[]{1, 2}, new int[]{0, 2}};

            int[] result = sol.runNumArray(nums, operations, values);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{7};
            String[] operations = new String[]{"sumRange", "update", "sumRange"};
            int[][] values = new int[][]{new int[]{0, 0}, new int[]{0, 4}, new int[]{0, 0}};

            int[] result = sol.runNumArray(nums, operations, values);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
