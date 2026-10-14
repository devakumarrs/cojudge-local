import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "abc";
            String t = "ahbgdc";

            boolean result = sol.isSubsequence(s, t);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "axc";
            String t = "ahbgdc";

            boolean result = sol.isSubsequence(s, t);
            System.out.println("Example 2: " + result);
        }
    }
}
