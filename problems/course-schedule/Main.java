import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int numCourses = 2;
            int[][] prerequisites = new int[][]{new int[]{1, 0}};

            boolean result = sol.canFinish(numCourses, prerequisites);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int numCourses = 2;
            int[][] prerequisites = new int[][]{new int[]{1, 0}, new int[]{0, 1}};

            boolean result = sol.canFinish(numCourses, prerequisites);
            System.out.println("Example 2: " + result);
        }
    }
}
