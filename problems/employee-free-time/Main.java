import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] schedule = new int[][]{new int[]{1, 2, 5, 6}, new int[]{1, 3}, new int[]{4, 10}};

            List<List<Integer>> result = sol.employeeFreeTime(schedule);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] schedule = new int[][]{new int[]{1, 3, 6, 7}, new int[]{2, 4}, new int[]{2, 5, 9, 12}};

            List<List<Integer>> result = sol.employeeFreeTime(schedule);
            System.out.println("Example 2: " + result);
        }
    }
}
