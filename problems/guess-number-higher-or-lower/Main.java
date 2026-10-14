import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 10;
            int pick = 6;

            int result = sol.guessNumber(n, pick);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 1;
            int pick = 1;

            int result = sol.guessNumber(n, pick);
            System.out.println("Example 2: " + result);
        }
    }
}
