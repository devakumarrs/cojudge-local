import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{1, 3};
            int[] nums2 = new int[]{2};

            String result = sol.findMedianSortedArrays(nums1, nums2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{1, 2};
            int[] nums2 = new int[]{3, 4};

            String result = sol.findMedianSortedArrays(nums1, nums2);
            System.out.println("Example 2: " + result);
        }
    }
}
