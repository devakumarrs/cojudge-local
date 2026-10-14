import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"RandomizedCollection", "insert", "insert", "insert", "getRandom", "remove", "getRandom"};
            int[] values = new int[]{0, 1, 1, 2, 0, 1, 0};

            int[] result = sol.runRandomizedCollection(operations, values);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"RandomizedCollection", "insert", "remove", "remove"};
            int[] values = new int[]{0, 4, 4, 4};

            int[] result = sol.runRandomizedCollection(operations, values);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
