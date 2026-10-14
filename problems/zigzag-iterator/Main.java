import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] v1 = new int[]{1, 2};
            int[] v2 = new int[]{3, 4, 5, 6};

            int[] result = sol.zigzagIterate(v1, v2);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] v1 = new int[]{1};
            int[] v2 = new int[]{};

            int[] result = sol.zigzagIterate(v1, v2);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
