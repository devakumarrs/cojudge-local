import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String equation = "x+5-3+x=6+x-2";

            String result = sol.solveEquation(equation);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String equation = "x=x";

            String result = sol.solveEquation(equation);
            System.out.println("Example 2: " + result);
        }
    }
}
