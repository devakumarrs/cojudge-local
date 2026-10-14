import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"};
            int[] values = new int[]{0, 1, 2, 2, 0, 1, 2, 0};

            int[] result = sol.runRandomizedSet(operations, values);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"RandomizedSet", "insert", "insert", "getRandom"};
            int[] values = new int[]{0, 5, 5, 0};

            int[] result = sol.runRandomizedSet(operations, values);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
