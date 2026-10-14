import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int numRows = 5;

            List<List<Integer>> result = sol.generate(numRows);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int numRows = 1;

            List<List<Integer>> result = sol.generate(numRows);
            System.out.println("Example 2: " + result);
        }
    }
}
