import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] row = new int[]{0, 2, 1, 3};

            int result = sol.minSwapsCouples(row);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] row = new int[]{3, 2, 0, 1};

            int result = sol.minSwapsCouples(row);
            System.out.println("Example 2: " + result);
        }
    }
}
