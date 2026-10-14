import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] board = new String[]{"XXXX", "XOOX", "XXOX", "XOXX"};

            List<String> result = sol.solve(board);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] board = new String[]{"X"};

            List<String> result = sol.solve(board);
            System.out.println("Example 2: " + result);
        }
    }
}
