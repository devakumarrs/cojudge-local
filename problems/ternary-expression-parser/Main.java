import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String expression = "T?2:3";

            String result = sol.parseTernary(expression);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String expression = "F?1:T?4:5";

            String result = sol.parseTernary(expression);
            System.out.println("Example 2: " + result);
        }
    }
}
