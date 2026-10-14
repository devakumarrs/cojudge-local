import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 2;
            int[][] meetings = new int[][]{new int[]{0, 10}, new int[]{1, 5}, new int[]{2, 7}, new int[]{3, 4}};

            int result = sol.mostBooked(n, meetings);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 3;
            int[][] meetings = new int[][]{new int[]{1, 20}, new int[]{2, 10}, new int[]{3, 5}, new int[]{4, 9}, new int[]{6, 8}};

            int result = sol.mostBooked(n, meetings);
            System.out.println("Example 2: " + result);
        }
    }
}
