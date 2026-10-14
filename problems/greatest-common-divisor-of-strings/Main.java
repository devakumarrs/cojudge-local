import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String str1 = "ABCABC";
            String str2 = "ABC";

            String result = sol.gcdOfStrings(str1, str2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String str1 = "ABABAB";
            String str2 = "ABAB";

            String result = sol.gcdOfStrings(str1, str2);
            System.out.println("Example 2: " + result);
        }
    }
}
