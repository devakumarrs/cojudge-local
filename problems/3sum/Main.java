import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{-1, 0, 1, 2, -1, -4};

            int[][] result = sol.threeSum(nums);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{0, 1, 1};

            int[][] result = sol.threeSum(nums);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
