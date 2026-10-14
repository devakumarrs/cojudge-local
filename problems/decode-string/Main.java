import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "3[a]2[bc]";

            String result = sol.decodeString(s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "3[a2[c]]";

            String result = sol.decodeString(s);
            System.out.println("Example 2: " + result);
        }
    }
}
