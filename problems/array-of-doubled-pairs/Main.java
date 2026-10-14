import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{3, 1, 3, 6};

            boolean result = sol.canReorderDoubled(arr);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{2, 1, 2, 6};

            boolean result = sol.canReorderDoubled(arr);
            System.out.println("Example 2: " + result);
        }
    }
}
