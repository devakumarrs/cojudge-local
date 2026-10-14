import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int width = 3;
            int height = 2;
            int[][] food = new int[][]{new int[]{1, 2}, new int[]{0, 1}};
            String[] moves = new String[]{"R", "D", "R", "U", "L", "U"};

            int[] result = sol.runSnakeGame(width, height, food, moves);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int width = 2;
            int height = 2;
            int[][] food = new int[][]{};
            String[] moves = new String[]{"R", "D", "L"};

            int[] result = sol.runSnakeGame(width, height, food, moves);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
