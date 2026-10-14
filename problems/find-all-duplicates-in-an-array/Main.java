import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};

            List<Integer> result = sol.findDuplicates(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 1, 2};

            List<Integer> result = sol.findDuplicates(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
