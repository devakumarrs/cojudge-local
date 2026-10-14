import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "aa";
            String p = "a";

            boolean result = sol.isMatch(s, p);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "aa";
            String p = "a*";

            boolean result = sol.isMatch(s, p);
            System.out.println("Example 2: " + result);
        }
    }
}
