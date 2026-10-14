import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int m = 3;
            int n = 3;
            int[][] positions = new int[][]{new int[]{0, 0}, new int[]{0, 1}, new int[]{1, 2}, new int[]{2, 1}};

            List<Integer> result = sol.numIslands2(m, n, positions);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int m = 1;
            int n = 1;
            int[][] positions = new int[][]{new int[]{0, 0}};

            List<Integer> result = sol.numIslands2(m, n, positions);
            System.out.println("Example 2: " + result);
        }
    }
}
