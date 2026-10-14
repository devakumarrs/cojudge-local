import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s1 = "abcdebdde";
            String s2 = "bde";

            String result = sol.minWindow(s1, s2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s1 = "abc";
            String s2 = "ac";

            String result = sol.minWindow(s1, s2);
            System.out.println("Example 2: " + result);
        }
    }
}
