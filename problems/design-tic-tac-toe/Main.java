import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"TicTacToe", "move", "move", "move", "move", "move", "move", "move"};
            int[][] args = new int[][]{new int[]{3}, new int[]{0, 0, 1}, new int[]{0, 2, 2}, new int[]{2, 2, 1}, new int[]{1, 1, 2}, new int[]{2, 0, 1}, new int[]{1, 0, 2}, new int[]{2, 1, 1}};

            int[] result = sol.runTicTacToe(operations, args);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"TicTacToe", "move", "move", "move"};
            int[][] args = new int[][]{new int[]{2}, new int[]{0, 0, 1}, new int[]{1, 1, 2}, new int[]{0, 1, 1}};

            int[] result = sol.runTicTacToe(operations, args);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
