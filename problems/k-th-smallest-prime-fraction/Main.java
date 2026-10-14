import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{1, 2, 3, 5};
            int k = 3;

            int[] result = sol.kthSmallestPrimeFraction(arr, k);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{1, 7};
            int k = 1;

            int[] result = sol.kthSmallestPrimeFraction(arr, k);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
