import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int rows = 1;
            int cols = 4;
            int rStart = 0;
            int cStart = 0;

            int[][] result = sol.spiralMatrixIII(rows, cols, rStart, cStart);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int rows = 3;
            int cols = 3;
            int rStart = 0;
            int cStart = 0;

            int[][] result = sol.spiralMatrixIII(rows, cols, rStart, cStart);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
