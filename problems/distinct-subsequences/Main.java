import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "rabbbit";
            String t = "rabbit";

            int result = sol.numDistinct(s, t);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "babgbag";
            String t = "bag";

            int result = sol.numDistinct(s, t);
            System.out.println("Example 2: " + result);
        }
    }
}
