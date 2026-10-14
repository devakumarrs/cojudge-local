import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] difficulty = new int[]{2, 4, 6, 8, 10};
            int[] profit = new int[]{10, 20, 30, 40, 50};
            int[] worker = new int[]{4, 5, 6, 7};

            int result = sol.maxProfitAssignment(difficulty, profit, worker);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] difficulty = new int[]{85, 47, 57};
            int[] profit = new int[]{24, 66, 99};
            int[] worker = new int[]{40, 25, 25};

            int result = sol.maxProfitAssignment(difficulty, profit, worker);
            System.out.println("Example 2: " + result);
        }
    }
}
