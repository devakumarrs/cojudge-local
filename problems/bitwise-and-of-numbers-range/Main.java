import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int left = 5;
            int right = 7;

            int result = sol.rangeBitwiseAnd(left, right);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int left = 0;
            int right = 0;

            int result = sol.rangeBitwiseAnd(left, right);
            System.out.println("Example 2: " + result);
        }
    }
}
