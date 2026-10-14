import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{-4, -2, 2, 4};
            int a = 1;
            int b = 3;
            int c = 5;

            int[] result = sol.sortTransformedArray(nums, a, b, c);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{-4, -2, 2, 4};
            int a = -1;
            int b = 3;
            int c = 5;

            int[] result = sol.sortTransformedArray(nums, a, b, c);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
