import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String word1 = "abc";
            String word2 = "pqr";

            String result = sol.mergeAlternately(word1, word2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String word1 = "ab";
            String word2 = "pqrs";

            String result = sol.mergeAlternately(word1, word2);
            System.out.println("Example 2: " + result);
        }
    }
}
