import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String pattern = "abba";
            String s = "dog cat cat dog";

            boolean result = sol.wordPattern(pattern, s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String pattern = "abba";
            String s = "dog cat cat fish";

            boolean result = sol.wordPattern(pattern, s);
            System.out.println("Example 2: " + result);
        }
    }
}
