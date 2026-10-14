import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 10;
            int k = 1;
            int maxPts = 10;

            String result = sol.new21Game(n, k, maxPts);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 6;
            int k = 1;
            int maxPts = 10;

            String result = sol.new21Game(n, k, maxPts);
            System.out.println("Example 2: " + result);
        }
    }
}
