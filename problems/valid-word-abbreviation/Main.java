import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String word = "internationalization";
            String abbr = "i12iz4n";

            boolean result = sol.validWordAbbreviation(word, abbr);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String word = "apple";
            String abbr = "a2e";

            boolean result = sol.validWordAbbreviation(word, abbr);
            System.out.println("Example 2: " + result);
        }
    }
}
