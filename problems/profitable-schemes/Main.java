import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 5;
            int minProfit = 3;
            int[] group = new int[]{2, 2};
            int[] profit = new int[]{2, 3};

            int result = sol.profitableSchemes(n, minProfit, group, profit);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 10;
            int minProfit = 5;
            int[] group = new int[]{2, 3, 5};
            int[] profit = new int[]{6, 7, 8};

            int result = sol.profitableSchemes(n, minProfit, group, profit);
            System.out.println("Example 2: " + result);
        }
    }
}
