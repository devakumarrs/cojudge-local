import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 12;

            List<List<Integer>> result = sol.getFactors(n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 37;

            List<List<Integer>> result = sol.getFactors(n);
            System.out.println("Example 2: " + result);
        }
    }
}
