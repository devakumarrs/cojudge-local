import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] aliceSizes = new int[]{1, 1};
            int[] bobSizes = new int[]{2, 2};

            int[] result = sol.fairCandySwap(aliceSizes, bobSizes);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] aliceSizes = new int[]{1, 2};
            int[] bobSizes = new int[]{2, 3};

            int[] result = sol.fairCandySwap(aliceSizes, bobSizes);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
