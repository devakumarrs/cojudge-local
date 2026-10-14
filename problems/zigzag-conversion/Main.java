import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "PAYPALISHIRING";
            int numRows = 3;

            String result = sol.convert(s, numRows);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "PAYPALISHIRING";
            int numRows = 4;

            String result = sol.convert(s, numRows);
            System.out.println("Example 2: " + result);
        }
    }
}
