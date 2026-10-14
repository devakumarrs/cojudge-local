import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{1, 3, 5, 4};
            int[] nums2 = new int[]{1, 2, 3, 7};

            int result = sol.minSwap(nums1, nums2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{0, 3, 5, 8, 9};
            int[] nums2 = new int[]{2, 1, 4, 6, 9};

            int result = sol.minSwap(nums1, nums2);
            System.out.println("Example 2: " + result);
        }
    }
}
