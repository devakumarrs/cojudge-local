import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"gin", "zen", "gig", "msg"};

            int result = sol.uniqueMorseRepresentations(words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"a"};

            int result = sol.uniqueMorseRepresentations(words);
            System.out.println("Example 2: " + result);
        }
    }
}
