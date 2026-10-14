import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String tasks = "AAABBB";
            int n = 2;

            int result = sol.leastInterval(tasks, n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String tasks = "AAABBB";
            int n = 0;

            int result = sol.leastInterval(tasks, n);
            System.out.println("Example 2: " + result);
        }
    }
}
