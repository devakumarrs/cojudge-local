import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"abcd", "dcba", "lls", "s", "sssll"};

            List<List<Integer>> result = sol.palindromePairs(words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"bat", "tab", "cat"};

            List<List<Integer>> result = sol.palindromePairs(words);
            System.out.println("Example 2: " + result);
        }
    }
}
