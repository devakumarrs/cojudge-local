import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{12, 28, 46, 32, 50};
            int[] nums2 = new int[]{50, 12, 32, 46, 28};

            int[] result = sol.anagramMappings(nums1, nums2);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums1 = new int[]{84, 46};
            int[] nums2 = new int[]{84, 46};

            int[] result = sol.anagramMappings(nums1, nums2);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
