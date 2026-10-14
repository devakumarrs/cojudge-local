import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "abcabcbb";

            int result = sol.lengthOfLongestSubstring(s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "bbbbb";

            int result = sol.lengthOfLongestSubstring(s);
            System.out.println("Example 2: " + result);
        }
    }
}
