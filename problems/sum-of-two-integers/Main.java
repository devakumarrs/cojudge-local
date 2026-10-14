import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int a = 1;
            int b = 2;

            int result = sol.getSum(a, b);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int a = -1;
            int b = 1;

            int result = sol.getSum(a, b);
            System.out.println("Example 2: " + result);
        }
    }
}
