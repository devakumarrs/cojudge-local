import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{2, 1};

            boolean result = sol.validMountainArray(arr);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{3, 5, 5};

            boolean result = sol.validMountainArray(arr);
            System.out.println("Example 2: " + result);
        }
    }
}
