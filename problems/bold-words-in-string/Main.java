import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"ab", "bc"};
            String s = "aabcd";

            String result = sol.boldWords(words, s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"ab", "cb"};
            String s = "aabcd";

            String result = sol.boldWords(words, s);
            System.out.println("Example 2: " + result);
        }
    }
}
