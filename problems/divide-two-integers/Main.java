import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int dividend = 10;
            int divisor = 3;

            int result = sol.divide(dividend, divisor);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int dividend = 7;
            int divisor = -3;

            int result = sol.divide(dividend, divisor);
            System.out.println("Example 2: " + result);
        }
    }
}
