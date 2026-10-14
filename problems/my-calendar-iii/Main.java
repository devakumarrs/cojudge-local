import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MyCalendarThree", "book", "book", "book", "book", "book", "book"};
            int[][] args = new int[][]{new int[]{}, new int[]{10, 20}, new int[]{50, 60}, new int[]{10, 40}, new int[]{5, 15}, new int[]{5, 10}, new int[]{25, 55}};

            int[] result = sol.runCalendarThree(operations, args);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MyCalendarThree", "book", "book", "book"};
            int[][] args = new int[][]{new int[]{}, new int[]{0, 10}, new int[]{10, 20}, new int[]{5, 15}};

            int[] result = sol.runCalendarThree(operations, args);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
