import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] prices = new int[]{3, 3, 5, 0, 0, 3, 1, 4};

            int result = sol.maxProfit(prices);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] prices = new int[]{1, 2, 3, 4, 5};

            int result = sol.maxProfit(prices);
            System.out.println("Example 2: " + result);
        }
    }
}
