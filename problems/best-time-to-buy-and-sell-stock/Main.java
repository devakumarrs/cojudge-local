import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] prices = new int[]{7, 1, 5, 3, 6, 4};

            int result = sol.maxProfit(prices);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] prices = new int[]{7, 6, 4, 3, 1};

            int result = sol.maxProfit(prices);
            System.out.println("Example 2: " + result);
        }
    }
}
