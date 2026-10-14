import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] citations = new int[]{3, 0, 6, 1, 5};

            int result = sol.hIndex(citations);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] citations = new int[]{1, 3, 1};

            int result = sol.hIndex(citations);
            System.out.println("Example 2: " + result);
        }
    }
}
