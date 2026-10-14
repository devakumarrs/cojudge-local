import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String pattern = "abab";
            String s = "redblueredblue";

            boolean result = sol.wordPatternMatch(pattern, s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String pattern = "aaaa";
            String s = "asdasdasdasd";

            boolean result = sol.wordPatternMatch(pattern, s);
            System.out.println("Example 2: " + result);
        }
    }
}
