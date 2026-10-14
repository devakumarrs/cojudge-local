import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] maze = new int[][]{new int[]{0, 0, 1, 0, 0}, new int[]{0, 0, 0, 0, 0}, new int[]{0, 0, 0, 1, 0}, new int[]{1, 1, 0, 1, 1}, new int[]{0, 0, 0, 0, 0}};
            int[] start = new int[]{0, 4};
            int[] destination = new int[]{4, 4};

            boolean result = sol.hasPath(maze, start, destination);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] maze = new int[][]{new int[]{0, 0, 1, 0, 0}, new int[]{0, 0, 0, 0, 0}, new int[]{0, 0, 0, 1, 0}, new int[]{1, 1, 0, 1, 1}, new int[]{0, 0, 0, 0, 0}};
            int[] start = new int[]{0, 4};
            int[] destination = new int[]{3, 2};

            boolean result = sol.hasPath(maze, start, destination);
            System.out.println("Example 2: " + result);
        }
    }
}
