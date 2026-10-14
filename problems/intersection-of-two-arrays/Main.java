import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{1, 2, 2, 1};
            int[] nums2 = new int[]{2, 2};

            int[] result = sol.intersection(nums1, nums2);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{4, 9, 5};
            int[] nums2 = new int[]{9, 4, 9, 8, 4};

            int[] result = sol.intersection(nums1, nums2);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
