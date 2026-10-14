import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 17, 8};

            int result = sol.numSquarefulPerms(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{2, 2, 2};

            int result = sol.numSquarefulPerms(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
