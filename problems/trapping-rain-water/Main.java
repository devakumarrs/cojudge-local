import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

            int result = sol.trap(height);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] height = new int[]{4, 2, 0, 3, 2, 5};

            int result = sol.trap(height);
            System.out.println("Example 2: " + result);
        }
    }
}
