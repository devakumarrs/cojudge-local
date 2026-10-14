import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "abcde";
            String[] words = new String[]{"a", "bb", "acd", "ace"};

            int result = sol.numMatchingSubseq(s, words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "dsahjpjauf";
            String[] words = new String[]{"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"};

            int result = sol.numMatchingSubseq(s, words);
            System.out.println("Example 2: " + result);
        }
    }
}
