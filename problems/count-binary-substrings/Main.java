import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "00110011";

            int result = sol.countBinarySubstrings(s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "10101";

            int result = sol.countBinarySubstrings(s);
            System.out.println("Example 2: " + result);
        }
    }
}
