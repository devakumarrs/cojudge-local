import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 3;
            int k = 1;

            int[] result = sol.constructArray(n, k);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 3;
            int k = 2;

            int[] result = sol.constructArray(n, k);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
