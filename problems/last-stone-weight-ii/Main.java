import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] stones = new int[]{2, 7, 4, 1, 8, 1};

            int result = sol.lastStoneWeightII(stones);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] stones = new int[]{31, 26, 33, 21, 40};

            int result = sol.lastStoneWeightII(stones);
            System.out.println("Example 2: " + result);
        }
    }
}
