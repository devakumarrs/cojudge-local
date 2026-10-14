import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 13;

            int result = sol.countDigitOne(n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 0;

            int result = sol.countDigitOne(n);
            System.out.println("Example 2: " + result);
        }
    }
}
