import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] candidates = new int[]{2, 3, 6, 7};
            int target = 7;

            int[][] result = sol.combinationSum(candidates, target);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] candidates = new int[]{2, 3, 5};
            int target = 8;

            int[][] result = sol.combinationSum(candidates, target);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
