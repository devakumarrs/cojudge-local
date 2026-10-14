import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String num = "69";

            boolean result = sol.isStrobogrammatic(num);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String num = "88";

            boolean result = sol.isStrobogrammatic(num);
            System.out.println("Example 2: " + result);
        }
    }
}
