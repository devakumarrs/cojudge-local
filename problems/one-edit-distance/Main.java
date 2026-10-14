import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "ab";
            String t = "acb";

            boolean result = sol.isOneEditDistance(s, t);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "cab";
            String t = "ad";

            boolean result = sol.isOneEditDistance(s, t);
            System.out.println("Example 2: " + result);
        }
    }
}
