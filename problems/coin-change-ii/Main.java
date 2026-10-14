import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int amount = 5;
            int[] coins = new int[]{1, 2, 5};

            int result = sol.change(amount, coins);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int amount = 3;
            int[] coins = new int[]{2};

            int result = sol.change(amount, coins);
            System.out.println("Example 2: " + result);
        }
    }
}
