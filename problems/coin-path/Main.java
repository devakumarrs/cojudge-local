import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] coins = new int[]{1, 2, 4, -1, 2};
            int maxJump = 2;

            List<Integer> result = sol.cheapestJump(coins, maxJump);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] coins = new int[]{1, 2, 4, -1, 2};
            int maxJump = 1;

            List<Integer> result = sol.cheapestJump(coins, maxJump);
            System.out.println("Example 2: " + result);
        }
    }
}
