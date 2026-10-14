import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int m = 3;
            int n = 1;
            int count = 2;

            int[][] result = sol.runFlip(m, n, count);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int m = 2;
            int n = 2;
            int count = 4;

            int[][] result = sol.runFlip(m, n, count);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
