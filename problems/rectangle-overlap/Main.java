import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] rec1 = new int[]{0, 0, 2, 2};
            int[] rec2 = new int[]{1, 1, 3, 3};

            boolean result = sol.isRectangleOverlap(rec1, rec2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] rec1 = new int[]{0, 0, 1, 1};
            int[] rec2 = new int[]{1, 0, 2, 1};

            boolean result = sol.isRectangleOverlap(rec1, rec2);
            System.out.println("Example 2: " + result);
        }
    }
}
