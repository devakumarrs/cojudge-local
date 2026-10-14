import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String low = "50";
            String high = "100";

            int result = sol.strobogrammaticInRange(low, high);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String low = "0";
            String high = "0";

            int result = sol.strobogrammaticInRange(low, high);
            System.out.println("Example 2: " + result);
        }
    }
}
