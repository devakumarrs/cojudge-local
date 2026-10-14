import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 5;
            int[][] mines = new int[][]{new int[]{4, 2}};

            int result = sol.orderOfLargestPlusSign(n, mines);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 1;
            int[][] mines = new int[][]{new int[]{0, 0}};

            int result = sol.orderOfLargestPlusSign(n, mines);
            System.out.println("Example 2: " + result);
        }
    }
}
