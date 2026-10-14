import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] deck = new int[]{17, 13, 11, 2, 3, 5, 7};

            int[] result = sol.deckRevealedIncreasing(deck);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] deck = new int[]{1, 1000};

            int[] result = sol.deckRevealedIncreasing(deck);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
