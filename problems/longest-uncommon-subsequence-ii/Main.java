import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] strs = new String[]{"aba", "cdc", "eae"};

            int result = sol.findLUSlength(strs);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] strs = new String[]{"aaa", "aaa", "aa"};

            int result = sol.findLUSlength(strs);
            System.out.println("Example 2: " + result);
        }
    }
}
