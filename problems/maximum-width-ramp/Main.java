import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{6, 0, 8, 2, 1, 5};

            int result = sol.maxWidthRamp(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{9, 8, 1, 0, 1, 9, 4, 0, 4, 1};

            int result = sol.maxWidthRamp(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
