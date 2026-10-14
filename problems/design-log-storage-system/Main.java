import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"LogSystem", "put", "put", "put", "retrieve"};
            String[] values = new String[]{"", "1|2017:01:01:23:59:59", "2|2017:01:01:22:59:59", "3|2016:01:01:00:00:00", "2016:01:01:01:01:01|2017:01:01:23:00:00|Year"};

            int[][] result = sol.runLogStorage(operations, values);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"LogSystem", "put", "put", "put", "retrieve"};
            String[] values = new String[]{"", "1|2017:01:01:23:59:59", "2|2017:01:01:22:59:59", "3|2016:01:01:00:00:00", "2016:01:01:01:01:01|2017:01:01:23:00:00|Hour"};

            int[][] result = sol.runLogStorage(operations, values);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
