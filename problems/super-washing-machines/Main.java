import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] machines = new int[]{1, 0, 5};

            int result = sol.findMinMoves(machines);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] machines = new int[]{0, 3, 0};

            int result = sol.findMinMoves(machines);
            System.out.println("Example 2: " + result);
        }
    }
}
