import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] bits = new int[]{1, 0, 0};

            boolean result = sol.isOneBitCharacter(bits);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] bits = new int[]{1, 1, 1, 0};

            boolean result = sol.isOneBitCharacter(bits);
            System.out.println("Example 2: " + result);
        }
    }
}
