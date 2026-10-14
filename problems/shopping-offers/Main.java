import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] price = new int[]{2, 5};
            int[][] special = new int[][]{new int[]{3, 0, 5}, new int[]{1, 2, 10}};
            int[] needs = new int[]{3, 2};

            int result = sol.shoppingOffers(price, special, needs);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] price = new int[]{2, 3, 4};
            int[][] special = new int[][]{new int[]{1, 1, 0, 4}, new int[]{2, 2, 1, 9}};
            int[] needs = new int[]{1, 2, 1};

            int result = sol.shoppingOffers(price, special, needs);
            System.out.println("Example 2: " + result);
        }
    }
}
