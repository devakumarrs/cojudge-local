import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 3;
            int k = 7;

            List<Integer> result = sol.numsSameConsecDiff(n, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 2;
            int k = 1;

            List<Integer> result = sol.numsSameConsecDiff(n, k);
            System.out.println("Example 2: " + result);
        }
    }
}
