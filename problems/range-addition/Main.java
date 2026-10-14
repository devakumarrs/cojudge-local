import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int length = 5;
            int[][] updates = new int[][]{new int[]{1, 3, 2}, new int[]{2, 4, 3}, new int[]{0, 2, -2}};

            int[] result = sol.getModifiedArray(length, updates);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int length = 3;
            int[][] updates = new int[][]{};

            int[] result = sol.getModifiedArray(length, updates);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
