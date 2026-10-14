import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] wordlist = new String[]{"acckzz", "ccbazz", "eiowzz", "abcczz"};
            String secret = "acckzz";

            String result = sol.runGuess(wordlist, secret);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] wordlist = new String[]{"hamada", "khaled"};
            String secret = "khaled";

            String result = sol.runGuess(wordlist, secret);
            System.out.println("Example 2: " + result);
        }
    }
}
