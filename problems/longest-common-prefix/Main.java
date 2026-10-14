import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] strs = new String[]{"flower", "flow", "flight"};

            String result = sol.longestCommonPrefix(strs);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] strs = new String[]{"dog", "racecar", "car"};

            String result = sol.longestCommonPrefix(strs);
            System.out.println("Example 2: " + result);
        }
    }
}
