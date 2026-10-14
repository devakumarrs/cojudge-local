import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] commands = new int[]{4, -1, 3};
            int[][] obstacles = new int[][]{};

            int result = sol.robotSim(commands, obstacles);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] commands = new int[]{4, -1, 4, -2, 4};
            int[][] obstacles = new int[][]{new int[]{2, 4}};

            int result = sol.robotSim(commands, obstacles);
            System.out.println("Example 2: " + result);
        }
    }
}
