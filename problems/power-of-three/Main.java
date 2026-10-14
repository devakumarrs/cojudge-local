import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 27;

            boolean result = sol.isPowerOfThree(n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 0;

            boolean result = sol.isPowerOfThree(n);
            System.out.println("Example 2: " + result);
        }
    }
}
