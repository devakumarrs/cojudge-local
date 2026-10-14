import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s1 = "this apple is sweet";
            String s2 = "this apple is sour";

            List<String> result = sol.uncommonFromSentences(s1, s2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s1 = "apple apple";
            String s2 = "banana";

            List<String> result = sol.uncommonFromSentences(s1, s2);
            System.out.println("Example 2: " + result);
        }
    }
}
