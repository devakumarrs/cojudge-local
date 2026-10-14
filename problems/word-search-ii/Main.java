import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            char[][] board = new char[][]{new char[]{'o', 'a', 'a', 'n'}, new char[]{'e', 't', 'a', 'e'}, new char[]{'i', 'h', 'k', 'r'}, new char[]{'i', 'f', 'l', 'v'}};
            String[] words = new String[]{"oath", "pea", "eat", "rain"};

            List<String> result = sol.findWords(board, words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            char[][] board = new char[][]{new char[]{'a', 'b'}, new char[]{'c', 'd'}};
            String[] words = new String[]{"ab", "cb", "ad", "bd", "ac", "ca", "da", "bc", "db", "adcb", "dabc", "abb", "acb"};

            List<String> result = sol.findWords(board, words);
            System.out.println("Example 2: " + result);
        }
    }
}
