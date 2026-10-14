import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{3, 1, 2, 4};

            int result = sol.sumSubarrayMins(arr);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{11, 81, 94, 43, 3};

            int result = sol.sumSubarrayMins(arr);
            System.out.println("Example 2: " + result);
        }
    }
}
