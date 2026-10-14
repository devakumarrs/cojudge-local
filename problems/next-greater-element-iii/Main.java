import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 12;

            int result = sol.nextGreaterElement(n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 21;

            int result = sol.nextGreaterElement(n);
            System.out.println("Example 2: " + result);
        }
    }
}
