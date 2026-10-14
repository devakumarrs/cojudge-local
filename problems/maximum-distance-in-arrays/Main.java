import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] arrays = new int[][]{new int[]{1, 2, 3}, new int[]{4, 5}, new int[]{1, 2, 3}};

            int result = sol.maxDistance(arrays);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] arrays = new int[][]{new int[]{1}, new int[]{1}};

            int result = sol.maxDistance(arrays);
            System.out.println("Example 2: " + result);
        }
    }
}
