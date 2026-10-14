import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{3, 2, 2, 3};
            int val = 3;

            int result = sol.removeElement(nums, val);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
            int val = 2;

            int result = sol.removeElement(nums, val);
            System.out.println("Example 2: " + result);
        }
    }
}
