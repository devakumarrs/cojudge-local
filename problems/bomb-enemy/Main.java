import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            char[][] grid = new char[][]{new char[]{'0', 'E', '0', '0'}, new char[]{'E', '0', 'W', 'E'}, new char[]{'0', 'E', '0', '0'}};

            int result = sol.maxKilledEnemies(grid);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            char[][] grid = new char[][]{new char[]{'W', 'W', 'W'}, new char[]{'0', '0', '0'}, new char[]{'E', 'E', 'E'}};

            int result = sol.maxKilledEnemies(grid);
            System.out.println("Example 2: " + result);
        }
    }
}
