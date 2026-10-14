import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 1;
            int k = 2;

            String result = sol.crackSafe(n, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 2;
            int k = 2;

            String result = sol.crackSafe(n, k);
            System.out.println("Example 2: " + result);
        }
    }
}
