import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "abccccdd";

            int result = sol.longestPalindrome(s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "a";

            int result = sol.longestPalindrome(s);
            System.out.println("Example 2: " + result);
        }
    }
}
