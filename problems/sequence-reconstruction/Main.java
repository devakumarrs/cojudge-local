import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3};
            int[][] sequences = new int[][]{new int[]{1, 2}, new int[]{1, 3}};

            boolean result = sol.sequenceReconstruction(nums, sequences);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3};
            int[][] sequences = new int[][]{new int[]{1, 2}, new int[]{1, 3}, new int[]{2, 3}};

            boolean result = sol.sequenceReconstruction(nums, sequences);
            System.out.println("Example 2: " + result);
        }
    }
}
