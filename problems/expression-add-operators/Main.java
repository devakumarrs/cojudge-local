import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String num = "123";
            int target = 6;

            List<String> result = sol.addOperators(num, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String num = "232";
            int target = 8;

            List<String> result = sol.addOperators(num, target);
            System.out.println("Example 2: " + result);
        }
    }
}
