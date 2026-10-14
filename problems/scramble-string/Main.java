import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s1 = "great";
            String s2 = "rgeat";

            boolean result = sol.isScramble(s1, s2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s1 = "abcde";
            String s2 = "caebd";

            boolean result = sol.isScramble(s1, s2);
            System.out.println("Example 2: " + result);
        }
    }
}
