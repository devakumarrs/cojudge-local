import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 4;
            int k = 2;

            List<List<Integer>> result = sol.combine(n, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 1;
            int k = 1;

            List<List<Integer>> result = sol.combine(n, k);
            System.out.println("Example 2: " + result);
        }
    }
}
