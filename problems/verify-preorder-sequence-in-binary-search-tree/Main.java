import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] preorder = new int[]{5, 2, 1, 3, 6};

            boolean result = sol.verifyPreorder(preorder);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] preorder = new int[]{5, 2, 6, 1, 3};

            boolean result = sol.verifyPreorder(preorder);
            System.out.println("Example 2: " + result);
        }
    }
}
