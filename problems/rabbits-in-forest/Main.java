import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] answers = new int[]{1, 1, 2};

            int result = sol.numRabbits(answers);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] answers = new int[]{10, 10, 10};

            int result = sol.numRabbits(answers);
            System.out.println("Example 2: " + result);
        }
    }
}
