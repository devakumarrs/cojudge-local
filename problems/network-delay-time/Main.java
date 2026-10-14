import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] times = new int[][]{new int[]{2, 1, 1}, new int[]{2, 3, 1}, new int[]{3, 4, 1}};
            int n = 4;
            int k = 2;

            int result = sol.networkDelayTime(times, n, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] times = new int[][]{new int[]{1, 2, 1}};
            int n = 2;
            int k = 1;

            int result = sol.networkDelayTime(times, n, k);
            System.out.println("Example 2: " + result);
        }
    }
}
