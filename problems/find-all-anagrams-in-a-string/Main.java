import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "cbaebabacd";
            String p = "abc";

            List<Integer> result = sol.findAnagrams(s, p);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "abab";
            String p = "ab";

            List<Integer> result = sol.findAnagrams(s, p);
            System.out.println("Example 2: " + result);
        }
    }
}
