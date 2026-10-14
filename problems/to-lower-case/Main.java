import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "Hello";

            String result = sol.toLowerCase(s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "LOVELY";

            String result = sol.toLowerCase(s);
            System.out.println("Example 2: " + result);
        }
    }
}
