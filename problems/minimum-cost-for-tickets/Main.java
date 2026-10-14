import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] days = new int[]{1, 4, 6, 7, 8, 20};
            int[] costs = new int[]{2, 7, 15};

            int result = sol.mincostTickets(days, costs);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] days = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31};
            int[] costs = new int[]{2, 7, 15};

            int result = sol.mincostTickets(days, costs);
            System.out.println("Example 2: " + result);
        }
    }
}
