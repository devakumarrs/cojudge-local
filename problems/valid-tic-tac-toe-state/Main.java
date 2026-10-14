import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] board = new String[]{"O--", "---", "---"};

            boolean result = sol.validTicTacToe(board);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] board = new String[]{"XOX", "-X-", "---"};

            boolean result = sol.validTicTacToe(board);
            System.out.println("Example 2: " + result);
        }
    }
}
