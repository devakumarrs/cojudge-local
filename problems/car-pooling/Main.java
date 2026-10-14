import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] trips = new int[][]{new int[]{2, 1, 5}, new int[]{3, 3, 7}};
            int capacity = 4;

            boolean result = sol.carPooling(trips, capacity);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] trips = new int[][]{new int[]{2, 1, 5}, new int[]{3, 3, 7}};
            int capacity = 5;

            boolean result = sol.carPooling(trips, capacity);
            System.out.println("Example 2: " + result);
        }
    }
}
