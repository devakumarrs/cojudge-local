import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] stones = new int[][]{new int[]{0, 0}, new int[]{0, 1}, new int[]{1, 0}, new int[]{1, 2}, new int[]{2, 1}, new int[]{2, 2}};

            int result = sol.removeStones(stones);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] stones = new int[][]{new int[]{0, 0}, new int[]{0, 2}, new int[]{1, 1}, new int[]{2, 0}, new int[]{2, 2}};

            int result = sol.removeStones(stones);
            System.out.println("Example 2: " + result);
        }
    }
}
