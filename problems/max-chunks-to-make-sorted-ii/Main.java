import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{5, 4, 3, 2, 1};

            int result = sol.maxChunksToSorted(arr);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{2, 1, 3, 4, 4};

            int result = sol.maxChunksToSorted(arr);
            System.out.println("Example 2: " + result);
        }
    }
}
