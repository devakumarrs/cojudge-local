import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int a = 1;
            int b = 1;
            int c = 7;

            String result = sol.longestDiverseString(a, b, c);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int a = 7;
            int b = 1;
            int c = 0;

            String result = sol.longestDiverseString(a, b, c);
            System.out.println("Example 2: " + result);
        }
    }
}
