import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
            int target = 8;

            int[][] result = sol.combinationSum2(candidates, target);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] candidates = new int[]{2, 5, 2, 1, 2};
            int target = 5;

            int[][] result = sol.combinationSum2(candidates, target);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
