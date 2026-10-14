import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3};

            int result = sol.minMoves2(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 10, 2, 9};

            int result = sol.minMoves2(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
