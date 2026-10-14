import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] vec = new int[][]{new int[]{1, 2}, new int[]{3}, new int[]{4}};
            String[] operations = new String[]{"next", "next", "next", "hasNext", "hasNext", "next", "hasNext"};

            int[] result = sol.runVector2D(vec, operations);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] vec = new int[][]{new int[]{}, new int[]{1}, new int[]{}, new int[]{2, 3}};
            String[] operations = new String[]{"hasNext", "next", "next", "next", "hasNext"};

            int[] result = sol.runVector2D(vec, operations);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
