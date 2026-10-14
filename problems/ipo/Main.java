import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int k = 2;
            int w = 0;
            int[] profits = new int[]{1, 2, 3};
            int[] capital = new int[]{0, 1, 1};

            int result = sol.findMaximizedCapital(k, w, profits, capital);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int k = 3;
            int w = 0;
            int[] profits = new int[]{1, 2, 3};
            int[] capital = new int[]{0, 1, 2};

            int result = sol.findMaximizedCapital(k, w, profits, capital);
            System.out.println("Example 2: " + result);
        }
    }
}
