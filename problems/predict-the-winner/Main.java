import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 5, 2};

            boolean result = sol.predictTheWinner(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 5, 233, 7};

            boolean result = sol.predictTheWinner(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
