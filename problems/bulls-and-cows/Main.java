import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String secret = "1807";
            String guess = "7810";

            String result = sol.getHint(secret, guess);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String secret = "1123";
            String guess = "0111";

            String result = sol.getHint(secret, guess);
            System.out.println("Example 2: " + result);
        }
    }
}
