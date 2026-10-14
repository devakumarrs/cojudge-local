import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] deck = new int[]{1, 2, 3, 4, 4, 3, 2, 1};

            boolean result = sol.hasGroupsSizeX(deck);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] deck = new int[]{1, 1, 1, 2, 2, 2, 3, 3};

            boolean result = sol.hasGroupsSizeX(deck);
            System.out.println("Example 2: " + result);
        }
    }
}
