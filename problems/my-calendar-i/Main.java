import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MyCalendar", "book", "book", "book"};
            int[][] args = new int[][]{new int[]{}, new int[]{10, 20}, new int[]{15, 25}, new int[]{20, 30}};

            int[] result = sol.runCalendar(operations, args);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MyCalendar", "book", "book"};
            int[][] args = new int[][]{new int[]{}, new int[]{5, 10}, new int[]{10, 15}};

            int[] result = sol.runCalendar(operations, args);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
