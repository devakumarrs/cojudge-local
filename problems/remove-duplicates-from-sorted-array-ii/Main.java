import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 1, 1, 2, 2, 3};

            int result = sol.removeDuplicates(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};

            int result = sol.removeDuplicates(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
