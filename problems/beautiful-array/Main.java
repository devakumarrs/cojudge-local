import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 4;

            int[] result = sol.beautifulArray(n);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 5;

            int[] result = sol.beautifulArray(n);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
