import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] cpdomains = new String[]{"9001 discuss.leetcode.com"};

            List<String> result = sol.subdomainVisits(cpdomains);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] cpdomains = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};

            List<String> result = sol.subdomainVisits(cpdomains);
            System.out.println("Example 2: " + result);
        }
    }
}
