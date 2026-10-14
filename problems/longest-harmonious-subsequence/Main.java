import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 3, 2, 2, 5, 2, 3, 7};

            int result = sol.findLHS(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3, 4};

            int result = sol.findLHS(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
