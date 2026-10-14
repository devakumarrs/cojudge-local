import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 4, 3, 2};

            int result = sol.arrayPairSum(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{6, 2, 6, 5, 1, 2};

            int result = sol.arrayPairSum(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
