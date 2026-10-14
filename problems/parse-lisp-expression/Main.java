import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String expression = "(add 1 2)";

            int result = sol.evaluate(expression);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String expression = "(mult 3 (add 2 3))";

            int result = sol.evaluate(expression);
            System.out.println("Example 2: " + result);
        }
    }
}
