import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] rods = new int[]{1, 2, 3, 6};

            int result = sol.tallestBillboard(rods);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] rods = new int[]{1, 2, 3, 4, 5, 6};

            int result = sol.tallestBillboard(rods);
            System.out.println("Example 2: " + result);
        }
    }
}
