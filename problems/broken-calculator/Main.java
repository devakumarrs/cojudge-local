import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int startValue = 2;
            int target = 3;

            int result = sol.brokenCalc(startValue, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int startValue = 5;
            int target = 8;

            int result = sol.brokenCalc(startValue, target);
            System.out.println("Example 2: " + result);
        }
    }
}
