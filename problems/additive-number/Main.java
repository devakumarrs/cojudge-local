import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String num = "112358";

            boolean result = sol.isAdditiveNumber(num);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String num = "199100199";

            boolean result = sol.isAdditiveNumber(num);
            System.out.println("Example 2: " + result);
        }
    }
}
