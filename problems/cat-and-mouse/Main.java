import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] graph = new int[][]{new int[]{2, 5}, new int[]{3}, new int[]{3, 4, 5}, new int[]{1, 2}, new int[]{2}, new int[]{0, 2}};

            int result = sol.catAndMouse(graph);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] graph = new int[][]{new int[]{1, 3}, new int[]{0}, new int[]{3}, new int[]{0, 2}};

            int result = sol.catAndMouse(graph);
            System.out.println("Example 2: " + result);
        }
    }
}
