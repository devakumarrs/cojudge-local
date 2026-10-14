import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String num1 = "2";
            String num2 = "3";

            String result = sol.multiply(num1, num2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String num1 = "123";
            String num2 = "456";

            String result = sol.multiply(num1, num2);
            System.out.println("Example 2: " + result);
        }
    }
}
