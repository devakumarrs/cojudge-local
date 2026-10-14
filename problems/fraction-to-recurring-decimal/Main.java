import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int numerator = 1;
            int denominator = 2;

            String result = sol.fractionToDecimal(numerator, denominator);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int numerator = 2;
            int denominator = 1;

            String result = sol.fractionToDecimal(numerator, denominator);
            System.out.println("Example 2: " + result);
        }
    }
}
