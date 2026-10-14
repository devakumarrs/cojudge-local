import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int m = 2;
            int n = 2;
            int maxMove = 2;
            int startRow = 0;
            int startColumn = 0;

            int result = sol.findPaths(m, n, maxMove, startRow, startColumn);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int m = 1;
            int n = 3;
            int maxMove = 3;
            int startRow = 0;
            int startColumn = 1;

            int result = sol.findPaths(m, n, maxMove, startRow, startColumn);
            System.out.println("Example 2: " + result);
        }
    }
}
