import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] ghosts = new int[][]{new int[]{1, 0}, new int[]{0, 3}};
            int[] target = new int[]{0, 1};

            boolean result = sol.escapeGhosts(ghosts, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] ghosts = new int[][]{new int[]{1, 0}};
            int[] target = new int[]{2, 0};

            boolean result = sol.escapeGhosts(ghosts, target);
            System.out.println("Example 2: " + result);
        }
    }
}
