import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "ADOBECODEBANC";
            String t = "ABC";

            String result = sol.minWindow(s, t);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "a";
            String t = "a";

            String result = sol.minWindow(s, t);
            System.out.println("Example 2: " + result);
        }
    }
}
