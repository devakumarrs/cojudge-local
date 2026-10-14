import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] deadends = new String[]{"0201", "0101", "0102", "1212", "2002"};
            String target = "0202";

            int result = sol.openLock(deadends, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] deadends = new String[]{"8888"};
            String target = "0009";

            int result = sol.openLock(deadends, target);
            System.out.println("Example 2: " + result);
        }
    }
}
