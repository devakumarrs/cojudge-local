import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] stoneValue = new int[]{1, 2, 3, 7};

            String result = sol.stoneGameIII(stoneValue);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] stoneValue = new int[]{1, 2, 3, -9};

            String result = sol.stoneGameIII(stoneValue);
            System.out.println("Example 2: " + result);
        }
    }
}
