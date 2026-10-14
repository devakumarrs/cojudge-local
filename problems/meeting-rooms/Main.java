import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] intervals = new int[][]{new int[]{0, 30}, new int[]{5, 10}, new int[]{15, 20}};

            boolean result = sol.canAttendMeetings(intervals);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] intervals = new int[][]{new int[]{7, 10}, new int[]{2, 4}};

            boolean result = sol.canAttendMeetings(intervals);
            System.out.println("Example 2: " + result);
        }
    }
}
