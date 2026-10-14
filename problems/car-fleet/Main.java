import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int target = 12;
            int[] position = new int[]{10, 8, 0, 5, 3};
            int[] speed = new int[]{2, 4, 1, 1, 3};

            int result = sol.carFleet(target, position, speed);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int target = 10;
            int[] position = new int[]{3};
            int[] speed = new int[]{3};

            int result = sol.carFleet(target, position, speed);
            System.out.println("Example 2: " + result);
        }
    }
}
