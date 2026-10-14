import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{1, 2, 3, 4, 5};
            int k = 4;
            int x = 3;

            int[] result = sol.findClosestElements(arr, k, x);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{1, 2, 3, 4, 5};
            int k = 4;
            int x = -1;

            int[] result = sol.findClosestElements(arr, k, x);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
