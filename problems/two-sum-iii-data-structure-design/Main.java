import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"add", "add", "add", "find", "find"};
            int[] values = new int[]{1, 3, 5, 4, 7};

            int[] result = sol.runTwoSum(operations, values);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"add", "add", "find"};
            int[] values = new int[]{0, 0, 0};

            int[] result = sol.runTwoSum(operations, values);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
