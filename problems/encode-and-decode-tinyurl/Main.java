import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String url = "https://leetcode.com/problems/design-tinyurl";

            String result = sol.codecRoundTrip(url);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String url = "https://example.com/a/long/path?q=1";

            String result = sol.codecRoundTrip(url);
            System.out.println("Example 2: " + result);
        }
    }
}
