import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "abcxyz123";
            String[] dict = new String[]{"abc", "123"};

            String result = sol.addBoldTag(s, dict);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "aaabbcc";
            String[] dict = new String[]{"aaa", "aab", "bc"};

            String result = sol.addBoldTag(s, dict);
            System.out.println("Example 2: " + result);
        }
    }
}
