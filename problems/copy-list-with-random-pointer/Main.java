import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] nodes = new int[][]{new int[]{7, -1}, new int[]{13, 0}, new int[]{11, 4}, new int[]{10, 2}, new int[]{1, 0}};

            int[][] result = sol.copyRandomList(nodes);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] nodes = new int[][]{new int[]{1, 1}, new int[]{2, 1}};

            int[][] result = sol.copyRandomList(nodes);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
