import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] cards = new int[]{4, 1, 8, 7};

            boolean result = sol.judgePoint24(cards);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] cards = new int[]{1, 2, 1, 2};

            boolean result = sol.judgePoint24(cards);
            System.out.println("Example 2: " + result);
        }
    }
}
