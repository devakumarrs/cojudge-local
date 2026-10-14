import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int m = 1;
            int n = 1;

            int result = sol.numberOfPatterns(m, n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int m = 1;
            int n = 2;

            int result = sol.numberOfPatterns(m, n);
            System.out.println("Example 2: " + result);
        }
    }
}
