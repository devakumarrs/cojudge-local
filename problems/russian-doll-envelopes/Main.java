import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] envelopes = new int[][]{new int[]{5, 4}, new int[]{6, 4}, new int[]{6, 7}, new int[]{2, 3}};

            int result = sol.maxEnvelopes(envelopes);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] envelopes = new int[][]{new int[]{1, 1}, new int[]{1, 1}, new int[]{1, 1}};

            int result = sol.maxEnvelopes(envelopes);
            System.out.println("Example 2: " + result);
        }
    }
}
