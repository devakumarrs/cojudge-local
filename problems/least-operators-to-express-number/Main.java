import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int x = 3;
            int target = 19;

            int result = sol.leastOpsExpressTarget(x, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int x = 5;
            int target = 501;

            int result = sol.leastOpsExpressTarget(x, target);
            System.out.println("Example 2: " + result);
        }
    }
}
