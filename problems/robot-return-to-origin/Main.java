import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String moves = "UD";

            boolean result = sol.judgeCircle(moves);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String moves = "LL";

            boolean result = sol.judgeCircle(moves);
            System.out.println("Example 2: " + result);
        }
    }
}
