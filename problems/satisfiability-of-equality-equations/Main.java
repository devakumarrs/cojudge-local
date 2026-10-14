import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] equations = new String[]{"a==b", "b!=a"};

            boolean result = sol.equationsPossible(equations);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] equations = new String[]{"b==a", "a==b"};

            boolean result = sol.equationsPossible(equations);
            System.out.println("Example 2: " + result);
        }
    }
}
