import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] seats = new int[]{1, 0, 0, 0, 1, 0, 1};

            int result = sol.maxDistToClosest(seats);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] seats = new int[]{1, 0, 0, 0};

            int result = sol.maxDistToClosest(seats);
            System.out.println("Example 2: " + result);
        }
    }
}
