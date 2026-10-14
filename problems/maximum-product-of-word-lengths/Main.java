import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};

            int result = sol.maxProduct(words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"};

            int result = sol.maxProduct(words);
            System.out.println("Example 2: " + result);
        }
    }
}
