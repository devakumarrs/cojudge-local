import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"};

            List<String> result = sol.findAllConcatenatedWordsInADict(words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"cat", "dog", "catdog"};

            List<String> result = sol.findAllConcatenatedWordsInADict(words);
            System.out.println("Example 2: " + result);
        }
    }
}
