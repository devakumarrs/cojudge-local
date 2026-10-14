import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"push", "push", "top", "pop", "empty"};
            int[] values = new int[]{1, 2, 0, 0, 0};

            int[] result = sol.runStackUsingQueues(operations, values);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"push", "top", "pop", "empty"};
            int[] values = new int[]{1, 0, 0, 0};

            int[] result = sol.runStackUsingQueues(operations, values);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
