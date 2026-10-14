import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String order = "cba";
            String s = "abcd";

            String result = sol.customSortString(order, s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String order = "bcafg";
            String s = "abcd";

            String result = sol.customSortString(order, s);
            System.out.println("Example 2: " + result);
        }
    }
}
