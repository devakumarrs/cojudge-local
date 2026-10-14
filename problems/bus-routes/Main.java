import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] routes = new int[][]{new int[]{1, 2, 7}, new int[]{3, 6, 7}};
            int source = 1;
            int target = 6;

            int result = sol.numBusesToDestination(routes, source, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] routes = new int[][]{new int[]{7, 12}, new int[]{4, 5, 15}, new int[]{6}, new int[]{15, 19}, new int[]{9, 12, 13}};
            int source = 15;
            int target = 12;

            int result = sol.numBusesToDestination(routes, source, target);
            System.out.println("Example 2: " + result);
        }
    }
}
