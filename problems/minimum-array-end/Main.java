import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 3;
            int x = 4;

            String result = sol.minEnd(n, x);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 2;
            int x = 7;

            String result = sol.minEnd(n, x);
            System.out.println("Example 2: " + result);
        }
    }
}
