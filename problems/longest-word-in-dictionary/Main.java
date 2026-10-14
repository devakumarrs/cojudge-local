import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"w", "wo", "wor", "worl", "world"};

            String result = sol.longestWord(words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"};

            String result = sol.longestWord(words);
            System.out.println("Example 2: " + result);
        }
    }
}
