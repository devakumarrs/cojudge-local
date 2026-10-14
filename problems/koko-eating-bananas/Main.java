import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] piles = new int[]{3, 6, 7, 11};
            int h = 8;

            int result = sol.minEatingSpeed(piles, h);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] piles = new int[]{30, 11, 23, 4, 20};
            int h = 5;

            int result = sol.minEatingSpeed(piles, h);
            System.out.println("Example 2: " + result);
        }
    }
}
