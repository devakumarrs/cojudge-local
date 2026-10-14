import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "11011000";

            String result = sol.makeLargestSpecial(s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "10";

            String result = sol.makeLargestSpecial(s);
            System.out.println("Example 2: " + result);
        }
    }
}
