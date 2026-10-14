import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] tokens = new String[]{"2", "1", "+", "3", "*"};

            int result = sol.evalRpn(tokens);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] tokens = new String[]{"4", "13", "5", "/", "+"};

            int result = sol.evalRpn(tokens);
            System.out.println("Example 2: " + result);
        }
    }
}
