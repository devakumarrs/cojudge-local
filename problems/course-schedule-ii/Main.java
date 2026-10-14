import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int numCourses = 2;
            int[][] prerequisites = new int[][]{new int[]{1, 0}};

            int[] result = sol.findOrder(numCourses, prerequisites);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int numCourses = 4;
            int[][] prerequisites = new int[][]{new int[]{1, 0}, new int[]{2, 0}, new int[]{3, 1}, new int[]{3, 2}};

            int[] result = sol.findOrder(numCourses, prerequisites);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
