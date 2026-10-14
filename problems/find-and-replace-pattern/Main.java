import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"};
            String pattern = "abb";

            List<String> result = sol.findAndReplacePattern(words, pattern);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"a", "b", "c"};
            String pattern = "a";

            List<String> result = sol.findAndReplacePattern(words, pattern);
            System.out.println("Example 2: " + result);
        }
    }
}
