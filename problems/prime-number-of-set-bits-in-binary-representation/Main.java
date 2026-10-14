import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int left = 6;
            int right = 10;

            int result = sol.countPrimeSetBits(left, right);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int left = 10;
            int right = 15;

            int result = sol.countPrimeSetBits(left, right);
            System.out.println("Example 2: " + result);
        }
    }
}
