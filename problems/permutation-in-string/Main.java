import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s1 = "ab";
            String s2 = "eidbaooo";

            boolean result = sol.checkInclusion(s1, s2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s1 = "ab";
            String s2 = "eidboaoo";

            boolean result = sol.checkInclusion(s1, s2);
            System.out.println("Example 2: " + result);
        }
    }
}
