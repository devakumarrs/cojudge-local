import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int target = 1;
            int startFuel = 1;
            int[][] stations = new int[][]{};

            int result = sol.minRefuelStops(target, startFuel, stations);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int target = 100;
            int startFuel = 1;
            int[][] stations = new int[][]{new int[]{10, 100}};

            int result = sol.minRefuelStops(target, startFuel, stations);
            System.out.println("Example 2: " + result);
        }
    }
}
