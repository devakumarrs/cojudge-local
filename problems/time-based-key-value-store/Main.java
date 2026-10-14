import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"set", "get", "get", "set", "get", "get"};
            String[] keys = new String[]{"foo", "foo", "foo", "foo", "foo", "foo"};
            String[] values = new String[]{"bar", "", "", "bar2", "", ""};
            int[] timestamps = new int[]{1, 1, 3, 4, 4, 5};

            List<String> result = sol.runTimeMap(operations, keys, values, timestamps);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"set", "set", "get", "get", "get"};
            String[] keys = new String[]{"love", "love", "love", "love", "love"};
            String[] values = new String[]{"high", "low", "", "", ""};
            int[] timestamps = new int[]{10, 20, 5, 10, 15};

            List<String> result = sol.runTimeMap(operations, keys, values, timestamps);
            System.out.println("Example 2: " + result);
        }
    }
}
