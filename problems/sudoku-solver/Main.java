import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] board = new String[]{"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};

            List<String> result = sol.solveSudoku(board);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] board = new String[]{"5.4.7.9.2", ".7.1.5.4.", "1.8.4.5.7", ".5.7.1.2.", "4.6.5.7.1", ".1.9.4.5.", "9.1.3.2.4", ".8.4.9.3.", "3.5.8.1.9"};

            List<String> result = sol.solveSudoku(board);
            System.out.println("Example 2: " + result);
        }
    }
}
