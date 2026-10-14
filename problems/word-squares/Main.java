import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"area", "lead", "wall", "lady", "ball"};

            List<List<String>> result = sol.wordSquares(words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"abat", "baba", "atan", "atal"};

            List<List<String>> result = sol.wordSquares(words);
            System.out.println("Example 2: " + result);
        }
    }
}
