import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String n = "123";

            String result = sol.nearestPalindromic(n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String n = "1";

            String result = sol.nearestPalindromic(n);
            System.out.println("Example 2: " + result);
        }
    }
}
