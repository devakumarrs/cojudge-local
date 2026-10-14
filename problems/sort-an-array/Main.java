import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{5, 2, 3, 1};

            int[] result = sol.sortArray(nums);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{5, 1, 1, 2, 0, 0};

            int[] result = sol.sortArray(nums);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
