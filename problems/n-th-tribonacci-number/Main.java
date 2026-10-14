import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 4;

            int result = sol.tribonacci(n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 25;

            int result = sol.tribonacci(n);
            System.out.println("Example 2: " + result);
        }
    }
}
