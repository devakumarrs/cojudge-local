import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{2, 7, 11, 15};
            int[] nums2 = new int[]{1, 10, 4, 11};

            int[] result = sol.advantageCount(nums1, nums2);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{12, 24, 8, 32};
            int[] nums2 = new int[]{13, 25, 32, 11};

            int[] result = sol.advantageCount(nums1, nums2);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
