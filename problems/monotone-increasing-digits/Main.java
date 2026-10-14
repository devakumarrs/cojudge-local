import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 10;

            int result = sol.monotoneIncreasingDigits(n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 1234;

            int result = sol.monotoneIncreasingDigits(n);
            System.out.println("Example 2: " + result);
        }
    }
}
