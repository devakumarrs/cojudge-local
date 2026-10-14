import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 7, 4, 9, 2, 5};

            int result = sol.wiggleMaxLength(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 17, 5, 10, 13, 15, 10, 5, 16, 8};

            int result = sol.wiggleMaxLength(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
