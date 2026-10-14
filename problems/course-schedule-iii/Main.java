import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] courses = new int[][]{new int[]{100, 200}, new int[]{200, 1300}, new int[]{1000, 1250}, new int[]{2000, 3200}};

            int result = sol.scheduleCourse(courses);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] courses = new int[][]{new int[]{1, 2}};

            int result = sol.scheduleCourse(courses);
            System.out.println("Example 2: " + result);
        }
    }
}
