import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int m = 3;
            int n = 7;

            int result = sol.uniquePaths(m, n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int m = 3;
            int n = 2;

            int result = sol.uniquePaths(m, n);
            System.out.println("Example 2: " + result);
        }
    }
}
