import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{1, 2};
            int[] nums2 = new int[]{-2, -1};
            int[] nums3 = new int[]{-1, 2};
            int[] nums4 = new int[]{0, 2};

            int result = sol.fourSumCount(nums1, nums2, nums3, nums4);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{0};
            int[] nums2 = new int[]{0};
            int[] nums3 = new int[]{0};
            int[] nums4 = new int[]{0};

            int result = sol.fourSumCount(nums1, nums2, nums3, nums4);
            System.out.println("Example 2: " + result);
        }
    }
}
