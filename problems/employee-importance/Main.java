import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] employees = new int[][]{new int[]{1, 5, 2, 3}, new int[]{2, 3}, new int[]{3, 3}};
            int id = 1;

            int result = sol.getImportance(employees, id);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] employees = new int[][]{new int[]{1, 2, 2}, new int[]{2, 3}};
            int id = 2;

            int result = sol.getImportance(employees, id);
            System.out.println("Example 2: " + result);
        }
    }
}
