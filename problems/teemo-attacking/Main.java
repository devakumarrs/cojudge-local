import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] timeSeries = new int[]{1, 4};
            int duration = 2;

            int result = sol.findPoisonedDuration(timeSeries, duration);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] timeSeries = new int[]{1, 2};
            int duration = 2;

            int result = sol.findPoisonedDuration(timeSeries, duration);
            System.out.println("Example 2: " + result);
        }
    }
}
