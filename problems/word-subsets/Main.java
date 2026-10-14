import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words1 = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
            String[] words2 = new String[]{"e", "o"};

            List<String> result = sol.wordSubsets(words1, words2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words1 = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
            String[] words2 = new String[]{"lo", "eo"};

            List<String> result = sol.wordSubsets(words1, words2);
            System.out.println("Example 2: " + result);
        }
    }
}
