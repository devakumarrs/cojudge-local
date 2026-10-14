import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 1};

            int[] result = sol.nextGreaterElements(nums);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3, 4, 3};

            int[] result = sol.nextGreaterElements(nums);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
