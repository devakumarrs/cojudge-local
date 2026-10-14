import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 2;
            String[] logs = new String[]{"0:start:0", "1:start:2", "1:end:5", "0:end:6"};

            int[] result = sol.exclusiveTime(n, logs);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 1;
            String[] logs = new String[]{"0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7"};

            int[] result = sol.exclusiveTime(n, logs);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
