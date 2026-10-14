import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String a = "abcd";
            String b = "cdabcdab";

            int result = sol.repeatedStringMatch(a, b);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String a = "a";
            String b = "aa";

            int result = sol.repeatedStringMatch(a, b);
            System.out.println("Example 2: " + result);
        }
    }
}
