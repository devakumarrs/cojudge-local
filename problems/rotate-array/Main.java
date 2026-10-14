import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
            int k = 3;

            int[] result = sol.rotate(nums, k);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{-1, -100, 3, 99};
            int k = 2;

            int[] result = sol.rotate(nums, k);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
