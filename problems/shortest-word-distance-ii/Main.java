import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] wordsDict = new String[]{"practice", "makes", "perfect", "coding", "makes"};
            String[] word1s = new String[]{"coding", "makes"};
            String[] word2s = new String[]{"practice", "coding"};

            int[] result = sol.runShortestWordDistance(wordsDict, word1s, word2s);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] wordsDict = new String[]{"a", "b", "c", "a"};
            String[] word1s = new String[]{"a"};
            String[] word2s = new String[]{"c"};

            int[] result = sol.runShortestWordDistance(wordsDict, word1s, word2s);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
