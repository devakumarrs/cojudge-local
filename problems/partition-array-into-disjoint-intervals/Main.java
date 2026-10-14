import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{5, 0, 3, 8, 6};

            int result = sol.partitionDisjoint(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 1, 1, 0, 6, 12};

            int result = sol.partitionDisjoint(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
