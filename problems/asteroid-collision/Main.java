import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] asteroids = new int[]{5, 10, -5};

            int[] result = sol.asteroidCollision(asteroids);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] asteroids = new int[]{8, -8};

            int[] result = sol.asteroidCollision(asteroids);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
