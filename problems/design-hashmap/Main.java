import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"};
            int[][] args = new int[][]{new int[]{}, new int[]{1, 1}, new int[]{2, 2}, new int[]{1}, new int[]{3}, new int[]{2, 1}, new int[]{2}, new int[]{2}, new int[]{2}};

            int[] result = sol.runHashMap(operations, args);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MyHashMap", "get", "put", "get", "remove", "get"};
            int[][] args = new int[][]{new int[]{}, new int[]{5}, new int[]{5, 7}, new int[]{5}, new int[]{5}, new int[]{5}};

            int[] result = sol.runHashMap(operations, args);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
