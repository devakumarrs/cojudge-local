import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String n = "13";

            String result = sol.smallestGoodBase(n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String n = "4681";

            String result = sol.smallestGoodBase(n);
            System.out.println("Example 2: " + result);
        }
    }
}
