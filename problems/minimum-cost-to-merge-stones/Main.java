import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] stones = new int[]{3, 2, 4, 1};
            int k = 2;

            int result = sol.mergeStones(stones, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] stones = new int[]{3, 2, 4, 1};
            int k = 3;

            int result = sol.mergeStones(stones, k);
            System.out.println("Example 2: " + result);
        }
    }
}
