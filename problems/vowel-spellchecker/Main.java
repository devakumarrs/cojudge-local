import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] wordlist = new String[]{"KiTe", "kite", "hare", "Hare"};
            String[] queries = new String[]{"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"};

            List<String> result = sol.spellchecker(wordlist, queries);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] wordlist = new String[]{"yellow"};
            String[] queries = new String[]{"YellOw"};

            List<String> result = sol.spellchecker(wordlist, queries);
            System.out.println("Example 2: " + result);
        }
    }
}
