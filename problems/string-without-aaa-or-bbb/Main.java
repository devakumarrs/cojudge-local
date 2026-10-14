import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int a = 1;
            int b = 2;

            String result = sol.strWithout3a3b(a, b);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int a = 4;
            int b = 1;

            String result = sol.strWithout3a3b(a, b);
            System.out.println("Example 2: " + result);
        }
    }
}
