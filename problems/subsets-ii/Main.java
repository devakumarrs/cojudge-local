import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 2};

            int[][] result = sol.subsetsWithDup(nums);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{0};

            int[][] result = sol.subsetsWithDup(nums);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
