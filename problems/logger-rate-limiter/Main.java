import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] timestamps = new int[]{1, 2, 3, 8, 10, 11};
            String[] messages = new String[]{"foo", "bar", "foo", "bar", "foo", "foo"};

            int[] result = sol.runLogger(timestamps, messages);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] timestamps = new int[]{0, 10, 20};
            String[] messages = new String[]{"a", "a", "a"};

            int[] result = sol.runLogger(timestamps, messages);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
