import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] digits = new String[]{"1", "3", "5", "7"};
            int n = 100;

            int result = sol.atMostNGivenDigitSet(digits, n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] digits = new String[]{"1", "4", "9"};
            int n = 1000000000;

            int result = sol.atMostNGivenDigitSet(digits, n);
            System.out.println("Example 2: " + result);
        }
    }
}
