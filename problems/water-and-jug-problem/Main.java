import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int x = 3;
            int y = 5;
            int target = 4;

            boolean result = sol.canMeasureWater(x, y, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int x = 2;
            int y = 6;
            int target = 5;

            boolean result = sol.canMeasureWater(x, y, target);
            System.out.println("Example 2: " + result);
        }
    }
}
