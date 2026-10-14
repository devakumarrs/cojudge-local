import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] gas = new int[]{1, 2, 3, 4, 5};
            int[] cost = new int[]{3, 4, 5, 1, 2};

            int result = sol.canCompleteCircuit(gas, cost);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] gas = new int[]{2, 3, 4};
            int[] cost = new int[]{3, 4, 3};

            int result = sol.canCompleteCircuit(gas, cost);
            System.out.println("Example 2: " + result);
        }
    }
}
