import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int k = 3;
            int n = 7;

            List<List<Integer>> result = sol.combinationSum3(k, n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int k = 3;
            int n = 9;

            List<List<Integer>> result = sol.combinationSum3(k, n);
            System.out.println("Example 2: " + result);
        }
    }
}
