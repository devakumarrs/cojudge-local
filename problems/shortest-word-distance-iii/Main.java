import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] wordsDict = new String[]{"practice", "makes", "perfect", "coding", "makes"};
            String word1 = "makes";
            String word2 = "coding";

            int result = sol.shortestWordDistance(wordsDict, word1, word2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] wordsDict = new String[]{"practice", "makes", "perfect", "coding", "makes"};
            String word1 = "makes";
            String word2 = "makes";

            int result = sol.shortestWordDistance(wordsDict, word1, word2);
            System.out.println("Example 2: " + result);
        }
    }
}
