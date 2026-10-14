import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String left = "4";
            String right = "1000";

            int result = sol.superpalindromesInRange(left, right);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String left = "1";
            String right = "2";

            int result = sol.superpalindromesInRange(left, right);
            System.out.println("Example 2: " + result);
        }
    }
}
