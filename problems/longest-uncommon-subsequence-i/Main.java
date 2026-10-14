import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String a = "aba";
            String b = "cdc";

            int result = sol.findLUSlength(a, b);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String a = "aaa";
            String b = "bbb";

            int result = sol.findLUSlength(a, b);
            System.out.println("Example 2: " + result);
        }
    }
}
