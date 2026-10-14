import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{5, 4, 0, 3, 1, 6, 2};

            int result = sol.arrayNesting(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{0, 1, 2};

            int result = sol.arrayNesting(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
