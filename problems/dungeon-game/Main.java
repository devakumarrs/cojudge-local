import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] dungeon = new int[][]{new int[]{-2, -3, 3}, new int[]{-5, -10, 1}, new int[]{10, 30, -5}};

            int result = sol.calculateMinimumHP(dungeon);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] dungeon = new int[][]{new int[]{0}};

            int result = sol.calculateMinimumHP(dungeon);
            System.out.println("Example 2: " + result);
        }
    }
}
