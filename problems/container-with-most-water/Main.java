import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};

            int result = sol.maxArea(height);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] height = new int[]{1, 1};

            int result = sol.maxArea(height);
            System.out.println("Example 2: " + result);
        }
    }
}
