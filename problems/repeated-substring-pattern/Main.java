import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "abab";

            boolean result = sol.repeatedSubstringPattern(s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "aba";

            boolean result = sol.repeatedSubstringPattern(s);
            System.out.println("Example 2: " + result);
        }
    }
}
