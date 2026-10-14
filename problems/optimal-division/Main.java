import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1000, 100, 10, 2};

            String result = sol.optimalDivision(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{2, 3, 4};

            String result = sol.optimalDivision(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
