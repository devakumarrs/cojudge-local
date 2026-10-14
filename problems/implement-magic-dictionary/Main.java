import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"buildDict", "search", "search", "search", "search"};
            String[] words = new String[]{"hello|leetcode", "hello", "hhllo", "hell", "leetcoded"};

            int[] result = sol.runMagicDictionary(operations, words);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"buildDict", "search", "search"};
            String[] words = new String[]{"hello|hallo", "hello", "hallo"};

            int[] result = sol.runMagicDictionary(operations, words);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
