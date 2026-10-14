import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] intervals = new int[][]{new int[]{1, 3}, new int[]{3, 7}, new int[]{8, 9}};

            int result = sol.intersectionSizeTwo(intervals);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] intervals = new int[][]{new int[]{1, 3}, new int[]{1, 4}, new int[]{2, 5}, new int[]{3, 5}};

            int result = sol.intersectionSizeTwo(intervals);
            System.out.println("Example 2: " + result);
        }
    }
}
