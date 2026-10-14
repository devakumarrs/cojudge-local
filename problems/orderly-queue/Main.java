import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "cba";
            int k = 1;

            String result = sol.orderlyQueue(s, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "baaca";
            int k = 3;

            String result = sol.orderlyQueue(s, k);
            System.out.println("Example 2: " + result);
        }
    }
}
