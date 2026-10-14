import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{1, 2, 3, 2, 1};
            int[] nums2 = new int[]{3, 2, 1, 4, 7};

            int result = sol.findLength(nums1, nums2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{0, 0, 0, 0, 0};
            int[] nums2 = new int[]{0, 0, 0, 0, 0};

            int result = sol.findLength(nums1, nums2);
            System.out.println("Example 2: " + result);
        }
    }
}
