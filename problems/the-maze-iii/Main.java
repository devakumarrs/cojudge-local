import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] maze = new int[][]{new int[]{0, 0, 0, 0, 0}, new int[]{1, 1, 0, 0, 1}, new int[]{0, 0, 0, 0, 0}, new int[]{0, 1, 0, 0, 1}, new int[]{0, 1, 0, 0, 0}};
            int[] ball = new int[]{4, 3};
            int[] hole = new int[]{0, 1};

            String result = sol.findShortestWay(maze, ball, hole);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] maze = new int[][]{new int[]{0, 0, 0, 0, 0}, new int[]{1, 1, 0, 0, 1}, new int[]{0, 0, 0, 0, 0}, new int[]{0, 1, 0, 0, 1}, new int[]{0, 1, 0, 0, 0}};
            int[] ball = new int[]{4, 3};
            int[] hole = new int[]{3, 0};

            String result = sol.findShortestWay(maze, ball, hole);
            System.out.println("Example 2: " + result);
        }
    }
}
