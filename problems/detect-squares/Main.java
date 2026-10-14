import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"DetectSquares", "add", "add", "add", "count", "count"};
            int[][] points = new int[][]{new int[]{0, 0}, new int[]{3, 10}, new int[]{11, 2}, new int[]{3, 2}, new int[]{11, 10}, new int[]{14, 8}};

            int[] result = sol.runDetectSquares(operations, points);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"DetectSquares", "add", "add", "add", "count", "add", "count"};
            int[][] points = new int[][]{new int[]{0, 0}, new int[]{3, 10}, new int[]{11, 2}, new int[]{3, 2}, new int[]{11, 10}, new int[]{11, 2}, new int[]{11, 10}};

            int[] result = sol.runDetectSquares(operations, points);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
