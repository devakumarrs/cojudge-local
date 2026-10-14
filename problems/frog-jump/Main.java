import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] stones = new int[]{0, 1, 3, 5, 6, 8, 12, 17};

            boolean result = sol.canCross(stones);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] stones = new int[]{0, 1, 2, 3, 4, 8, 9, 11};

            boolean result = sol.canCross(stones);
            System.out.println("Example 2: " + result);
        }
    }
}
