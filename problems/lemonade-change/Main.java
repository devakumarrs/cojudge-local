import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] bills = new int[]{5, 5, 5, 10, 20};

            boolean result = sol.lemonadeChange(bills);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] bills = new int[]{5, 5, 10, 10, 20};

            boolean result = sol.lemonadeChange(bills);
            System.out.println("Example 2: " + result);
        }
    }
}
