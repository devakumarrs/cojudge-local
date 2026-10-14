import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] matchsticks = new int[]{1, 1, 2, 2, 2};

            boolean result = sol.makesquare(matchsticks);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] matchsticks = new int[]{3, 3, 3, 3, 4};

            boolean result = sol.makesquare(matchsticks);
            System.out.println("Example 2: " + result);
        }
    }
}
