import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] flights = new int[][]{new int[]{0, 1, 1}, new int[]{1, 0, 1}, new int[]{1, 1, 0}};
            int[][] days = new int[][]{new int[]{1, 3, 1}, new int[]{6, 0, 3}, new int[]{3, 3, 3}};

            int result = sol.maxVacationDays(flights, days);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] flights = new int[][]{new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}};
            int[][] days = new int[][]{new int[]{1, 1, 1}, new int[]{7, 7, 7}, new int[]{7, 7, 7}};

            int result = sol.maxVacationDays(flights, days);
            System.out.println("Example 2: " + result);
        }
    }
}
