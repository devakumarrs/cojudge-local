import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int sx = 1;
            int sy = 1;
            int tx = 3;
            int ty = 5;

            boolean result = sol.reachingPoints(sx, sy, tx, ty);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int sx = 1;
            int sy = 1;
            int tx = 2;
            int ty = 2;

            boolean result = sol.reachingPoints(sx, sy, tx, ty);
            System.out.println("Example 2: " + result);
        }
    }
}
