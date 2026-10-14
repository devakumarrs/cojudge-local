import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
            int k = 2;

            List<String> result = sol.topKFrequent(words, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
            int k = 4;

            List<String> result = sol.topKFrequent(words, k);
            System.out.println("Example 2: " + result);
        }
    }
}
