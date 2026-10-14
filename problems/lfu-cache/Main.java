import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"LFUCache", "put", "put", "get", "put", "get", "get", "put", "get", "get", "get"};
            int[][] args = new int[][]{new int[]{2}, new int[]{1, 1}, new int[]{2, 2}, new int[]{1}, new int[]{3, 3}, new int[]{2}, new int[]{3}, new int[]{4, 4}, new int[]{1}, new int[]{3}, new int[]{4}};

            int[] result = sol.runLfuCache(operations, args);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"LFUCache", "put", "get", "put", "get", "get"};
            int[][] args = new int[][]{new int[]{1}, new int[]{2, 1}, new int[]{2}, new int[]{3, 2}, new int[]{2}, new int[]{3}};

            int[] result = sol.runLfuCache(operations, args);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
