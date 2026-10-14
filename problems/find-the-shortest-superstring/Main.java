import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"alex", "loves", "leetcode"};

            String result = sol.shortestSuperstring(words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"catg", "ctaagt", "gcta", "ttca", "atgcatc"};

            String result = sol.shortestSuperstring(words);
            System.out.println("Example 2: " + result);
        }
    }
}
