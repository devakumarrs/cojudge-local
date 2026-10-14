import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] wall = new int[][]{new int[]{1, 2, 2, 1}, new int[]{3, 1, 2}, new int[]{1, 3, 2}, new int[]{2, 4}, new int[]{3, 1, 2}, new int[]{1, 3, 1, 1}};

            int result = sol.leastBricks(wall);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] wall = new int[][]{new int[]{1}, new int[]{1}, new int[]{1}};

            int result = sol.leastBricks(wall);
            System.out.println("Example 2: " + result);
        }
    }
}
