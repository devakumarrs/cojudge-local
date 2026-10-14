import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String a = "11";
            String b = "1";

            String result = sol.addBinary(a, b);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String a = "1010";
            String b = "1011";

            String result = sol.addBinary(a, b);
            System.out.println("Example 2: " + result);
        }
    }
}
