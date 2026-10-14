import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{113, 215, 221};

            int result = sol.pathSum(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{113, 221};

            int result = sol.pathSum(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
