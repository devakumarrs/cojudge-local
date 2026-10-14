import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"};

            int result = sol.numSpecialEquivGroups(words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"abc", "acb", "bac", "bca", "cab", "cba"};

            int result = sol.numSpecialEquivGroups(words);
            System.out.println("Example 2: " + result);
        }
    }
}
