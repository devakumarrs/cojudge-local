import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] encoding = new int[]{3, 8, 0, 9, 2, 5};
            String[] operations = new String[]{"next", "next", "next", "next"};
            int[] values = new int[]{2, 1, 1, 2};

            int[] result = sol.runRle(encoding, operations, values);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] encoding = new int[]{1, 5};
            String[] operations = new String[]{"next", "next"};
            int[] values = new int[]{1, 1};

            int[] result = sol.runRle(encoding, operations, values);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
