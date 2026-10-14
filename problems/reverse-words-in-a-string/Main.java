import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "the sky is blue";

            String result = sol.reverseWords(s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "  hello world  ";

            String result = sol.reverseWords(s);
            System.out.println("Example 2: " + result);
        }
    }
}
