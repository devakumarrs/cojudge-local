import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "catsanddog";
            String[] wordDict = new String[]{"cat", "cats", "and", "sand", "dog"};

            List<String> result = sol.wordBreak(s, wordDict);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "pineapplepenapple";
            String[] wordDict = new String[]{"apple", "pen", "applepen", "pine", "pineapple"};

            List<String> result = sol.wordBreak(s, wordDict);
            System.out.println("Example 2: " + result);
        }
    }
}
