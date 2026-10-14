import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"like", "god", "internal", "me", "internet", "interval", "intension", "face", "intrusion"};

            List<String> result = sol.wordsAbbreviation(words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"abcdef", "abcdeg"};

            List<String> result = sol.wordsAbbreviation(words);
            System.out.println("Example 2: " + result);
        }
    }
}
