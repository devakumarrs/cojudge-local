import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "abcdefg";
            int k = 2;

            String result = sol.reverseStr(s, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "abcd";
            int k = 2;

            String result = sol.reverseStr(s, k);
            System.out.println("Example 2: " + result);
        }
    }
}
