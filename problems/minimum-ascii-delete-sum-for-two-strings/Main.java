import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s1 = "sea";
            String s2 = "eat";

            int result = sol.minimumDeleteSum(s1, s2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s1 = "delete";
            String s2 = "leet";

            int result = sol.minimumDeleteSum(s1, s2);
            System.out.println("Example 2: " + result);
        }
    }
}
