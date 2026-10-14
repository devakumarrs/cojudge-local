import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
            int m = 3;
            int[] nums2 = new int[]{2, 5, 6};
            int n = 3;

            int[] result = sol.merge(nums1, m, nums2, n);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{1};
            int m = 1;
            int[] nums2 = new int[]{};
            int n = 0;

            int[] result = sol.merge(nums1, m, nums2, n);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
