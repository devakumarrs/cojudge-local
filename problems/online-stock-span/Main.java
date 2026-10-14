import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] prices = new int[]{100, 80, 60, 70, 60, 75, 85};

            int[] result = sol.stockSpan(prices);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] prices = new int[]{10, 4, 5, 90, 120, 80};

            int[] result = sol.stockSpan(prices);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
