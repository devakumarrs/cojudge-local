import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] piles = new int[]{5, 3, 4, 5};

            boolean result = sol.stoneGame(piles);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] piles = new int[]{3, 7, 2, 3};

            boolean result = sol.stoneGame(piles);
            System.out.println("Example 2: " + result);
        }
    }
}
