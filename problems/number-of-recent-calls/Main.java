import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] pings = new int[]{1, 100, 3001, 3002};

            int[] result = sol.runRecentCalls(pings);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] pings = new int[]{1, 2, 3, 4};

            int[] result = sol.runRecentCalls(pings);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
