import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int k = 0;

            int result = sol.preimageSizeFZF(k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int k = 5;

            int result = sol.preimageSizeFZF(k);
            System.out.println("Example 2: " + result);
        }
    }
}
