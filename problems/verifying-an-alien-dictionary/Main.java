import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"hello", "leetcode"};
            String order = "hlabcdefgijkmnopqrstuvwxyz";

            boolean result = sol.isAlienSorted(words, order);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"word", "world", "row"};
            String order = "worldabcefghijkmnpqstuvxyz";

            boolean result = sol.isAlienSorted(words, order);
            System.out.println("Example 2: " + result);
        }
    }
}
