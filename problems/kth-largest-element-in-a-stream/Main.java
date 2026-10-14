import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int k = 3;
            int[] nums = new int[]{4, 5, 8, 2};
            int[] additions = new int[]{3, 5, 10, 9, 4};

            int[] result = sol.kthLargestStream(k, nums, additions);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int k = 1;
            int[] nums = new int[]{};
            int[] additions = new int[]{-3, -2, -4, 0, 4};

            int[] result = sol.kthLargestStream(k, nums, additions);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
