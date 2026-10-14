import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{2, -1, 1, 2, 2};

            boolean result = sol.circularArrayLoop(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{-1, 2};

            boolean result = sol.circularArrayLoop(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
