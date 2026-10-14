import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] transactions = new int[][]{new int[]{0, 1, 10}, new int[]{2, 0, 5}};

            int result = sol.minTransfers(transactions);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] transactions = new int[][]{new int[]{0, 1, 10}, new int[]{1, 0, 1}, new int[]{1, 2, 5}, new int[]{2, 0, 5}};

            int result = sol.minTransfers(transactions);
            System.out.println("Example 2: " + result);
        }
    }
}
