import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{4, 2, 5, 7};

            int[] result = sol.sortArrayByParityII(nums);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{2, 3};

            int[] result = sol.sortArrayByParityII(nums);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
