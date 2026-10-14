import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "A man, a plan, a canal: Panama";

            boolean result = sol.isPalindrome(s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "race a car";

            boolean result = sol.isPalindrome(s);
            System.out.println("Example 2: " + result);
        }
    }
}
