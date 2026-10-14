import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{2, 1, 4, 7, 3, 2, 5};

            int result = sol.longestMountain(arr);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{2, 2, 2};

            int result = sol.longestMountain(arr);
            System.out.println("Example 2: " + result);
        }
    }
}
