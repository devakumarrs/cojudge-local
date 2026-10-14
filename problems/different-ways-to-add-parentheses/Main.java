import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String expression = "2-1-1";

            List<Integer> result = sol.diffWaysToCompute(expression);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String expression = "2*3-4*5";

            List<Integer> result = sol.diffWaysToCompute(expression);
            System.out.println("Example 2: " + result);
        }
    }
}
