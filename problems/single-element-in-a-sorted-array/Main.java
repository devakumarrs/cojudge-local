import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};

            int result = sol.singleNonDuplicate(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{3, 3, 7, 7, 10, 11, 11};

            int result = sol.singleNonDuplicate(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
