import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] strs = new String[]{"10", "0001", "111001", "1", "0"};
            int m = 5;
            int n = 3;

            int result = sol.findMaxForm(strs, m, n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] strs = new String[]{"10", "0", "1"};
            int m = 1;
            int n = 1;

            int result = sol.findMaxForm(strs, m, n);
            System.out.println("Example 2: " + result);
        }
    }
}
