import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] rooms = new int[][]{new int[]{2147483647, -1, 0, 2147483647}, new int[]{2147483647, 2147483647, 2147483647, -1}, new int[]{2147483647, -1, 2147483647, -1}, new int[]{0, -1, 2147483647, 2147483647}};

            int[][] result = sol.wallsAndGates(rooms);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] rooms = new int[][]{new int[]{-1, 2147483647}, new int[]{0, 2147483647}};

            int[][] result = sol.wallsAndGates(rooms);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
