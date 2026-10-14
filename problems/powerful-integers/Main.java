import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int x = 2;
            int y = 3;
            int bound = 10;

            List<Integer> result = sol.powerfulIntegers(x, y, bound);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int x = 3;
            int y = 5;
            int bound = 15;

            List<Integer> result = sol.powerfulIntegers(x, y, bound);
            System.out.println("Example 2: " + result);
        }
    }
}
