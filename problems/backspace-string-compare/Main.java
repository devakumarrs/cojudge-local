import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "ab#c";
            String t = "ad#c";

            boolean result = sol.backspaceCompare(s, t);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "ab##";
            String t = "c#d#";

            boolean result = sol.backspaceCompare(s, t);
            System.out.println("Example 2: " + result);
        }
    }
}
