import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 4;
            int[][] flights = new int[][]{new int[]{0, 1, 100}, new int[]{1, 2, 100}, new int[]{2, 0, 100}, new int[]{1, 3, 600}, new int[]{2, 3, 200}};
            int src = 0;
            int dst = 3;
            int k = 1;

            int result = sol.findCheapestPrice(n, flights, src, dst, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 3;
            int[][] flights = new int[][]{new int[]{0, 1, 100}, new int[]{1, 2, 100}, new int[]{0, 2, 500}};
            int src = 0;
            int dst = 2;
            int k = 1;

            int result = sol.findCheapestPrice(n, flights, src, dst, k);
            System.out.println("Example 2: " + result);
        }
    }
}
