import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 3;
            int k = 3;

            String result = sol.getPermutation(n, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 4;
            int k = 9;

            String result = sol.getPermutation(n, k);
            System.out.println("Example 2: " + result);
        }
    }
}
