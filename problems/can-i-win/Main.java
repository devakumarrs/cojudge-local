import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int maxChoosableInteger = 10;
            int desiredTotal = 11;

            boolean result = sol.canIWin(maxChoosableInteger, desiredTotal);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int maxChoosableInteger = 10;
            int desiredTotal = 0;

            boolean result = sol.canIWin(maxChoosableInteger, desiredTotal);
            System.out.println("Example 2: " + result);
        }
    }
}
