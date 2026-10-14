import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{1, 2, 3, 4};

            String result = sol.largestTimeFromDigits(arr);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{5, 5, 5, 5};

            String result = sol.largestTimeFromDigits(arr);
            System.out.println("Example 2: " + result);
        }
    }
}
