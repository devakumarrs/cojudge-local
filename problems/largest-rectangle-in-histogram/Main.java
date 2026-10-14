import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] heights = new int[]{2, 1, 5, 6, 2, 3};

            int result = sol.largestRectangleArea(heights);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] heights = new int[]{2, 4};

            int result = sol.largestRectangleArea(heights);
            System.out.println("Example 2: " + result);
        }
    }
}
