import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] pushed = new int[]{1, 2, 3, 4, 5};
            int[] popped = new int[]{4, 5, 3, 2, 1};

            boolean result = sol.validateStackSequences(pushed, popped);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] pushed = new int[]{1, 2, 3, 4, 5};
            int[] popped = new int[]{4, 3, 5, 1, 2};

            boolean result = sol.validateStackSequences(pushed, popped);
            System.out.println("Example 2: " + result);
        }
    }
}
