import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "0.(52)";
            String t = "0.5(25)";

            boolean result = sol.isRationalEqual(s, t);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "0.1666(6)";
            String t = "0.166(66)";

            boolean result = sol.isRationalEqual(s, t);
            System.out.println("Example 2: " + result);
        }
    }
}
