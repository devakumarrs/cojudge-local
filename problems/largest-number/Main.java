import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{10, 2};

            String result = sol.largestNumber(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{3, 30, 34, 5, 9};

            String result = sol.largestNumber(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
