import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] people = new int[][]{new int[]{7, 0}, new int[]{4, 4}, new int[]{7, 1}, new int[]{5, 0}, new int[]{6, 1}, new int[]{5, 2}};

            int[][] result = sol.reconstructQueue(people);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] people = new int[][]{new int[]{6, 0}, new int[]{5, 0}, new int[]{4, 0}, new int[]{3, 2}, new int[]{2, 2}, new int[]{1, 4}};

            int[][] result = sol.reconstructQueue(people);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
