import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "()())()";

            List<String> result = sol.removeInvalidParentheses(s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "(a)())()";

            List<String> result = sol.removeInvalidParentheses(s);
            System.out.println("Example 2: " + result);
        }
    }
}
