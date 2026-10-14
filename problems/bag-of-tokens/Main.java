import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] tokens = new int[]{100};
            int power = 50;

            int result = sol.bagOfTokensScore(tokens, power);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] tokens = new int[]{200, 100};
            int power = 150;

            int result = sol.bagOfTokensScore(tokens, power);
            System.out.println("Example 2: " + result);
        }
    }
}
