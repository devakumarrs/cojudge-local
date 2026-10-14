import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 5;
            int bad = 4;

            int result = sol.firstBadVersion(n, bad);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 1;
            int bad = 1;

            int result = sol.firstBadVersion(n, bad);
            System.out.println("Example 2: " + result);
        }
    }
}
