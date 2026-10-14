import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"AllOne", "inc", "inc", "getMaxKey", "getMinKey", "inc", "getMaxKey", "getMinKey"};
            String[] values = new String[]{"", "hello", "hello", "", "", "leet", "", ""};

            List<String> result = sol.runAllOne(operations, values);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"AllOne", "inc", "inc", "inc", "getMaxKey", "getMinKey", "dec", "getMaxKey", "getMinKey"};
            String[] values = new String[]{"", "a", "b", "b", "", "", "b", "", ""};

            List<String> result = sol.runAllOne(operations, values);
            System.out.println("Example 2: " + result);
        }
    }
}
