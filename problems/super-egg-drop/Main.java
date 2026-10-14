import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int k = 1;
            int n = 2;

            int result = sol.superEggDrop(k, n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int k = 2;
            int n = 6;

            int result = sol.superEggDrop(k, n);
            System.out.println("Example 2: " + result);
        }
    }
}
