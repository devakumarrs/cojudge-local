import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"};
            int[] values = new int[]{0, 1, 2, 1, 3, 2, 2, 2, 2};

            int[] result = sol.runHashSet(operations, values);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MyHashSet", "contains", "add", "contains", "remove", "contains"};
            int[] values = new int[]{0, 5, 5, 5, 5, 5};

            int[] result = sol.runHashSet(operations, values);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
