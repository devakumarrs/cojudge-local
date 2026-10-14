import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{10, 13, 12, 14, 15};

            int result = sol.oddEvenJumps(arr);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{2, 3, 1, 1, 4};

            int result = sol.oddEvenJumps(arr);
            System.out.println("Example 2: " + result);
        }
    }
}
