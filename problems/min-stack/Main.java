import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"push", "push", "push", "getMin", "pop", "top", "getMin"};
            int[] values = new int[]{-2, 0, -3, 0, 0, 0, 0};

            int[] result = sol.runMinStack(operations, values);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"push", "push", "getMin", "top", "pop", "getMin"};
            int[] values = new int[]{5, 5, 0, 0, 0, 0};

            int[] result = sol.runMinStack(operations, values);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
