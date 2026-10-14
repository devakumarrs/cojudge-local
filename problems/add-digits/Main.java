import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int num = 38;

            int result = sol.addDigits(num);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int num = 0;

            int result = sol.addDigits(num);
            System.out.println("Example 2: " + result);
        }
    }
}
