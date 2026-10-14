import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{3, 4, 6, 5};
            int[] nums2 = new int[]{9, 1, 2, 5, 8, 3};
            int k = 5;

            int[] result = sol.maxNumber(nums1, nums2, k);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{6, 7};
            int[] nums2 = new int[]{6, 0, 4};
            int k = 5;

            int[] result = sol.maxNumber(nums1, nums2, k);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
