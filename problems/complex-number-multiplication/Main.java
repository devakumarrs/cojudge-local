import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String num1 = "1+1i";
            String num2 = "1+1i";

            String result = sol.complexNumberMultiply(num1, num2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String num1 = "1+-1i";
            String num2 = "1+-1i";

            String result = sol.complexNumberMultiply(num1, num2);
            System.out.println("Example 2: " + result);
        }
    }
}
