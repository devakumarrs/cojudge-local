import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int columnNumber = 1;

            String result = sol.convertToTitle(columnNumber);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int columnNumber = 28;

            String result = sol.convertToTitle(columnNumber);
            System.out.println("Example 2: " + result);
        }
    }
}
