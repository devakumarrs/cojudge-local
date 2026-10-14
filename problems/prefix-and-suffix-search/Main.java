import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"apple"};
            String pref = "a";
            String suff = "e";

            int result = sol.wordFilter(words, pref, suff);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"apple", "apply", "ape"};
            String pref = "ap";
            String suff = "e";

            int result = sol.wordFilter(words, pref, suff);
            System.out.println("Example 2: " + result);
        }
    }
}
