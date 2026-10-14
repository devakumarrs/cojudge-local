import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] coins = new int[]{1, 2, 5};
            int amount = 11;

            int result = sol.coinChange(coins, amount);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] coins = new int[]{2};
            int amount = 3;

            int result = sol.coinChange(coins, amount);
            System.out.println("Example 2: " + result);
        }
    }
}
