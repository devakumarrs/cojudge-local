import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String columnTitle = "A";

            int result = sol.titleToNumber(columnTitle);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String columnTitle = "AB";

            int result = sol.titleToNumber(columnTitle);
            System.out.println("Example 2: " + result);
        }
    }
}
