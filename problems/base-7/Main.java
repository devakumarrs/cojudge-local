import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int num = 100;

            String result = sol.convertToBase7(num);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int num = -7;

            String result = sol.convertToBase7(num);
            System.out.println("Example 2: " + result);
        }
    }
}
