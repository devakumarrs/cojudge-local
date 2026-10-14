import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] timePoints = new String[]{"23:59", "00:00"};

            int result = sol.findMinDifference(timePoints);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] timePoints = new String[]{"00:00", "23:59", "00:00"};

            int result = sol.findMinDifference(timePoints);
            System.out.println("Example 2: " + result);
        }
    }
}
