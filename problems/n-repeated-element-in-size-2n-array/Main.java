import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3, 3};

            int result = sol.repeatedNTimes(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{2, 1, 2, 5, 3, 2};

            int result = sol.repeatedNTimes(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
