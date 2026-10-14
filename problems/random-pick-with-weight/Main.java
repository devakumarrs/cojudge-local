import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] weights = new int[]{1, 3};
            int[] calls = new int[]{0, 1, 2, 3};

            int[] result = sol.runWeightedPick(weights, calls);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] weights = new int[]{2, 5, 3};
            int[] calls = new int[]{0, 2, 7, 9};

            int[] result = sol.runWeightedPick(weights, calls);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
