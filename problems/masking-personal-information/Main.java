import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "LeetCode@LeetCode.com";

            String result = sol.maskPII(s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "AB@qq.com";

            String result = sol.maskPII(s);
            System.out.println("Example 2: " + result);
        }
    }
}
