import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
            int maxWidth = 16;

            List<String> result = sol.fullJustify(words, maxWidth);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"What", "must", "be", "acknowledgment", "shall", "be"};
            int maxWidth = 16;

            List<String> result = sol.fullJustify(words, maxWidth);
            System.out.println("Example 2: " + result);
        }
    }
}
