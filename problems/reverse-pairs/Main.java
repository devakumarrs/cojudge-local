import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 3, 2, 3, 1};

            int result = sol.reversePairs(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{2, 4, 3, 5, 1};

            int result = sol.reversePairs(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
