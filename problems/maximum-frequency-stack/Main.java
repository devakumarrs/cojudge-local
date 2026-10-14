import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"push", "push", "push", "push", "push", "push", "pop", "pop", "pop", "pop"};
            int[] values = new int[]{5, 7, 5, 7, 4, 5, 0, 0, 0, 0};

            int[] result = sol.runFreqStack(operations, values);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"push", "push", "pop", "pop"};
            int[] values = new int[]{1, 1, 0, 0};

            int[] result = sol.runFreqStack(operations, values);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
