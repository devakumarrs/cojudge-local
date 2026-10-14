import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String queryIP = "172.16.254.1";

            String result = sol.validIPAddress(queryIP);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String queryIP = "2001:0db8:85a3:0:0:8A2E:0370:7334";

            String result = sol.validIPAddress(queryIP);
            System.out.println("Example 2: " + result);
        }
    }
}
