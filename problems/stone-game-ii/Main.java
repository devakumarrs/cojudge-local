import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] piles = new int[]{2, 7, 9, 4, 4};

            int result = sol.stoneGameII(piles);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] piles = new int[]{1, 2, 3, 4, 5, 100};

            int result = sol.stoneGameII(piles);
            System.out.println("Example 2: " + result);
        }
    }
}
