import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{1, 0, 1, 0, 1};

            int[] result = sol.threeEqualParts(arr);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{1, 1, 0, 1, 1};

            int[] result = sol.threeEqualParts(arr);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
