import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] prices = new int[]{1, 3, 2, 8, 4, 9};
            int fee = 2;

            int result = sol.maxProfit(prices, fee);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] prices = new int[]{1, 3, 7, 5, 10, 3};
            int fee = 3;

            int result = sol.maxProfit(prices, fee);
            System.out.println("Example 2: " + result);
        }
    }
}
