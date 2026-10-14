import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "Let's take LeetCode contest";

            String result = sol.reverseWords(s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "God Ding";

            String result = sol.reverseWords(s);
            System.out.println("Example 2: " + result);
        }
    }
}
