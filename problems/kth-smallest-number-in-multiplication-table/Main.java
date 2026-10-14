import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int m = 3;
            int n = 3;
            int k = 5;

            int result = sol.findKthNumber(m, n, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int m = 2;
            int n = 3;
            int k = 6;

            int result = sol.findKthNumber(m, n, k);
            System.out.println("Example 2: " + result);
        }
    }
}
