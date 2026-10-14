import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] p1 = new int[]{0, 0};
            int[] p2 = new int[]{1, 1};
            int[] p3 = new int[]{1, 0};
            int[] p4 = new int[]{0, 1};

            boolean result = sol.validSquare(p1, p2, p3, p4);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] p1 = new int[]{0, 0};
            int[] p2 = new int[]{1, 1};
            int[] p3 = new int[]{1, 0};
            int[] p4 = new int[]{0, 12};

            boolean result = sol.validSquare(p1, p2, p3, p4);
            System.out.println("Example 2: " + result);
        }
    }
}
