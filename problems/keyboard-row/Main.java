import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};

            List<String> result = sol.findWords(words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"omk"};

            List<String> result = sol.findWords(words);
            System.out.println("Example 2: " + result);
        }
    }
}
