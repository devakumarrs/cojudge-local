import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MovingAverage", "next", "next", "next", "next"};
            int[][] args = new int[][]{new int[]{3}, new int[]{1}, new int[]{10}, new int[]{3}, new int[]{5}};

            List<String> result = sol.runMovingAverage(operations, args);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MovingAverage", "next", "next"};
            int[][] args = new int[][]{new int[]{1}, new int[]{4}, new int[]{5}};

            List<String> result = sol.runMovingAverage(operations, args);
            System.out.println("Example 2: " + result);
        }
    }
}
