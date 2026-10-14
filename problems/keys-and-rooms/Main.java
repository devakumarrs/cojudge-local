import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] rooms = new int[][]{new int[]{1}, new int[]{2}, new int[]{3}, new int[]{}};

            boolean result = sol.canVisitAllRooms(rooms);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] rooms = new int[][]{new int[]{1, 3}, new int[]{3, 0, 1}, new int[]{2}, new int[]{0}};

            boolean result = sol.canVisitAllRooms(rooms);
            System.out.println("Example 2: " + result);
        }
    }
}
