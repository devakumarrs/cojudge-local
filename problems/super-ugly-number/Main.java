import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 12;
            int[] primes = new int[]{2, 7, 13, 19};

            int result = sol.nthSuperUglyNumber(n, primes);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 1;
            int[] primes = new int[]{2, 3, 5};

            int result = sol.nthSuperUglyNumber(n, primes);
            System.out.println("Example 2: " + result);
        }
    }
}
