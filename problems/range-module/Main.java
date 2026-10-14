import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"RangeModule", "addRange", "queryRange", "removeRange", "queryRange"};
            int[][] args = new int[][]{new int[]{}, new int[]{10, 20}, new int[]{10, 14}, new int[]{14, 16}, new int[]{10, 14}};

            int[] result = sol.runRangeModule(operations, args);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"RangeModule", "addRange", "addRange", "queryRange"};
            int[][] args = new int[][]{new int[]{}, new int[]{10, 15}, new int[]{15, 20}, new int[]{10, 20}};

            int[] result = sol.runRangeModule(operations, args);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
