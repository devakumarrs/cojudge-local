import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "aabbcc";
            int k = 3;

            String result = sol.rearrangeString(s, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "aaabc";
            int k = 3;

            String result = sol.rearrangeString(s, k);
            System.out.println("Example 2: " + result);
        }
    }
}
