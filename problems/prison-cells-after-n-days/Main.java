import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] cells = new int[]{0, 1, 0, 1, 1, 0, 0, 1};
            int n = 7;

            int[] result = sol.prisonAfterNDays(cells, n);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] cells = new int[]{1, 0, 0, 1, 0, 0, 1, 0};
            int n = 1;

            int[] result = sol.prisonAfterNDays(cells, n);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
