import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "Hello, my name is John";

            int result = sol.countSegments(s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "Hello";

            int result = sol.countSegments(s);
            System.out.println("Example 2: " + result);
        }
    }
}
