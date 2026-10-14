import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String ip = "255.0.0.7";
            int n = 10;

            List<String> result = sol.ipToCIDR(ip, n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String ip = "117.145.102.62";
            int n = 8;

            List<String> result = sol.ipToCIDR(ip, n);
            System.out.println("Example 2: " + result);
        }
    }
}
