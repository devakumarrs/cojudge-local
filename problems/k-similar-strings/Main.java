import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s1 = "ab";
            String s2 = "ba";

            int result = sol.kSimilarity(s1, s2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s1 = "abc";
            String s2 = "bca";

            int result = sol.kSimilarity(s1, s2);
            System.out.println("Example 2: " + result);
        }
    }
}
