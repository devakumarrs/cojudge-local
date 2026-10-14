import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int k = 2;
            int[] prices = new int[]{2, 4, 1};

            int result = sol.maxProfit(k, prices);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int k = 2;
            int[] prices = new int[]{3, 2, 6, 5, 0, 3};

            int result = sol.maxProfit(k, prices);
            System.out.println("Example 2: " + result);
        }
    }
}
