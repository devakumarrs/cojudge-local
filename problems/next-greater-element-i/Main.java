import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{4, 1, 2};
            int[] nums2 = new int[]{1, 3, 4, 2};

            int[] result = sol.nextGreaterElement(nums1, nums2);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{2, 4};
            int[] nums2 = new int[]{1, 2, 3, 4};

            int[] result = sol.nextGreaterElement(nums1, nums2);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
