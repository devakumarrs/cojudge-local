import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] emails = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};

            int result = sol.numUniqueEmails(emails);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] emails = new String[]{"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};

            int result = sol.numUniqueEmails(emails);
            System.out.println("Example 2: " + result);
        }
    }
}
