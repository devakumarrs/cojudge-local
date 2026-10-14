import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String board = "WRRBBW";
            String hand = "RB";

            int result = sol.findMinStep(board, hand);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String board = "WWRRBBWW";
            String hand = "WRBRW";

            int result = sol.findMinStep(board, hand);
            System.out.println("Example 2: " + result);
        }
    }
}
