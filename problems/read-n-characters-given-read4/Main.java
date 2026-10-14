import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String file = "abc";
            int n = 4;

            String result = sol.read(file, n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String file = "abcde";
            int n = 5;

            String result = sol.read(file, n);
            System.out.println("Example 2: " + result);
        }
    }
}
