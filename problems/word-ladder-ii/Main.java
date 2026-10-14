import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String beginWord = "hit";
            String endWord = "cog";
            String[] wordList = new String[]{"hot", "dot", "dog", "lot", "log", "cog"};

            List<List<String>> result = sol.findLadders(beginWord, endWord, wordList);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String beginWord = "hit";
            String endWord = "cog";
            String[] wordList = new String[]{"hot", "dot", "dog", "lot", "log"};

            List<List<String>> result = sol.findLadders(beginWord, endWord, wordList);
            System.out.println("Example 2: " + result);
        }
    }
}
