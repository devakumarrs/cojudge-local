import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String num1 = "11";
            String num2 = "123";

            String result = sol.addStrings(num1, num2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String num1 = "456";
            String num2 = "77";

            String result = sol.addStrings(num1, num2);
            System.out.println("Example 2: " + result);
        }
    }
}
