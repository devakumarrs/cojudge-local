import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String expression = "-1/2+1/2";

            String result = sol.fractionAddition(expression);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String expression = "-1/2+1/2+1/3";

            String result = sol.fractionAddition(expression);
            System.out.println("Example 2: " + result);
        }
    }
}
