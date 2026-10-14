import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String expression = "e + 8 - a + 5";
            String[] evalvars = new String[]{"e"};
            int[] evalints = new int[]{1};

            List<String> result = sol.basicCalculatorIV(expression, evalvars, evalints);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String expression = "e - 8 + temperature - pressure";
            String[] evalvars = new String[]{"e", "temperature"};
            int[] evalints = new int[]{1, 12};

            List<String> result = sol.basicCalculatorIV(expression, evalvars, evalints);
            System.out.println("Example 2: " + result);
        }
    }
}
