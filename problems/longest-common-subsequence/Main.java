import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String text1 = "abcde";
            String text2 = "ace";

            int result = sol.longestCommonSubsequence(text1, text2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String text1 = "abc";
            String text2 = "abc";

            int result = sol.longestCommonSubsequence(text1, text2);
            System.out.println("Example 2: " + result);
        }
    }
}
