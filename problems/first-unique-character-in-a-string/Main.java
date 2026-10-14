import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "leetcode";

            int result = sol.firstUniqChar(s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "loveleetcode";

            int result = sol.firstUniqChar(s);
            System.out.println("Example 2: " + result);
        }
    }
}
