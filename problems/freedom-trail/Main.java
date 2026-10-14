import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String ring = "godding";
            String key = "gd";

            int result = sol.findRotateSteps(ring, key);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String ring = "godding";
            String key = "godding";

            int result = sol.findRotateSteps(ring, key);
            System.out.println("Example 2: " + result);
        }
    }
}
