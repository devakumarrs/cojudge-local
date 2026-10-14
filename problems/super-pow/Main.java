import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int a = 2;
            int[] b = new int[]{3};

            int result = sol.superPow(a, b);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int a = 2;
            int[] b = new int[]{1, 0};

            int result = sol.superPow(a, b);
            System.out.println("Example 2: " + result);
        }
    }
}
