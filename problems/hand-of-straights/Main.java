import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] hand = new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8};
            int groupSize = 3;

            boolean result = sol.isNStraightHand(hand, groupSize);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] hand = new int[]{1, 2, 3, 4, 5};
            int groupSize = 4;

            boolean result = sol.isNStraightHand(hand, groupSize);
            System.out.println("Example 2: " + result);
        }
    }
}
