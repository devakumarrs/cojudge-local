import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{3, 10, 5, 25, 2, 8};

            int result = sol.findMaximumXOR(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70};

            int result = sol.findMaximumXOR(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
