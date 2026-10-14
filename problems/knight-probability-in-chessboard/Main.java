import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 3;
            int k = 2;
            int row = 0;
            int column = 0;

            String result = sol.knightProbability(n, k, row, column);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 1;
            int k = 0;
            int row = 0;
            int column = 0;

            String result = sol.knightProbability(n, k, row, column);
            System.out.println("Example 2: " + result);
        }
    }
}
