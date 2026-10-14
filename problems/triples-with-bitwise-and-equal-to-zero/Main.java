import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{2, 1, 3};

            int result = sol.countTriplets(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{0, 0, 0};

            int result = sol.countTriplets(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
