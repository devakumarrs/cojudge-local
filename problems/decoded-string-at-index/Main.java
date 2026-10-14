import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "leet2code3";
            int k = 10;

            String result = sol.decodeAtIndex(s, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "ha22";
            int k = 5;

            String result = sol.decodeAtIndex(s, k);
            System.out.println("Example 2: " + result);
        }
    }
}
