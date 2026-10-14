import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "leetscode";
            String[] dictionary = new String[]{"leet", "code", "leetcode"};

            int result = sol.minExtraChar(s, dictionary);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "sayhelloworld";
            String[] dictionary = new String[]{"hello", "world"};

            int result = sol.minExtraChar(s, dictionary);
            System.out.println("Example 2: " + result);
        }
    }
}
