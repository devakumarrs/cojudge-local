import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{-2, 0, 1, 3};
            int target = 2;

            int result = sol.threeSumSmaller(nums, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{};
            int target = 0;

            int result = sol.threeSumSmaller(nums, target);
            System.out.println("Example 2: " + result);
        }
    }
}
