import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "a1b2";

            List<String> result = sol.letterCasePermutation(s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "3z4";

            List<String> result = sol.letterCasePermutation(s);
            System.out.println("Example 2: " + result);
        }
    }
}
