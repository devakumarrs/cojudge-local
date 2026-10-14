import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"push", "push", "push", "top", "popMax", "top", "peekMax", "pop", "top"};
            int[] values = new int[]{5, 1, 5, 0, 0, 0, 0, 0, 0};

            int[] result = sol.runMaxStack(operations, values);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"push", "push", "peekMax", "pop", "peekMax"};
            int[] values = new int[]{2, 7, 0, 0, 0};

            int[] result = sol.runMaxStack(operations, values);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
