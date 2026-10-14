import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{3, 5, 2, 1, 6, 4};

            int[] result = sol.wiggleSort(nums);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{6, 6, 5, 6, 3, 8};

            int[] result = sol.wiggleSort(nums);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
