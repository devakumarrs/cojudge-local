import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{2, 4};

            int result = sol.numFactoredBinaryTrees(arr);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{2, 4, 5, 10};

            int result = sol.numFactoredBinaryTrees(arr);
            System.out.println("Example 2: " + result);
        }
    }
}
