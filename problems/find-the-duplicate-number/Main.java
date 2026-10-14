import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 3, 4, 2, 2};

            int result = sol.findDuplicate(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{3, 1, 3, 4, 2};

            int result = sol.findDuplicate(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
