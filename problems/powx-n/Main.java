import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String x = "2.0";
            int n = 10;

            String result = sol.myPow(x, n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String x = "2.1";
            int n = 3;

            String result = sol.myPow(x, n);
            System.out.println("Example 2: " + result);
        }
    }
}
