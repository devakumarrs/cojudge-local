import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int a = 48;

            int result = sol.smallestFactorization(a);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int a = 15;

            int result = sol.smallestFactorization(a);
            System.out.println("Example 2: " + result);
        }
    }
}
