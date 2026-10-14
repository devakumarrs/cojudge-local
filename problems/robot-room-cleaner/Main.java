import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] room = new int[][]{new int[]{1, 1, 1, 1, 1, 0, 1, 1}, new int[]{1, 1, 1, 1, 1, 0, 1, 1}, new int[]{1, 0, 1, 1, 1, 1, 1, 1}, new int[]{0, 0, 0, 1, 0, 0, 0, 0}, new int[]{1, 1, 1, 1, 1, 1, 1, 1}};
            int row = 1;
            int col = 3;

            int result = sol.cleanRoom(room, row, col);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] room = new int[][]{new int[]{1}};
            int row = 0;
            int col = 0;

            int result = sol.cleanRoom(room, row, col);
            System.out.println("Example 2: " + result);
        }
    }
}
