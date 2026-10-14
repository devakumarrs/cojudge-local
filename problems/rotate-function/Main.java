import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{4, 3, 2, 6};

            int result = sol.maxRotateFunction(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{100};

            int result = sol.maxRotateFunction(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
