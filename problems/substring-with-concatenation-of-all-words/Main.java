import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "barfoothefoobarman";
            String[] words = new String[]{"foo", "bar"};

            List<Integer> result = sol.findSubstring(s, words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "wordgoodgoodgoodbestword";
            String[] words = new String[]{"word", "good", "best", "word"};

            List<Integer> result = sol.findSubstring(s, words);
            System.out.println("Example 2: " + result);
        }
    }
}
