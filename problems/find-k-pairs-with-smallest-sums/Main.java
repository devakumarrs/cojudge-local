import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{1, 7, 11};
            int[] nums2 = new int[]{2, 4, 6};
            int k = 3;

            int[][] result = sol.kSmallestPairs(nums1, nums2, k);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{1, 1, 2};
            int[] nums2 = new int[]{1, 2, 3};
            int k = 2;

            int[][] result = sol.kSmallestPairs(nums1, nums2, k);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
