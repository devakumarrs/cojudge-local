import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            char[][] image = new char[][]{new char[]{'0', '0', '1', '0'}, new char[]{'0', '1', '1', '0'}, new char[]{'0', '1', '0', '0'}};
            int x = 0;
            int y = 2;

            int result = sol.minArea(image, x, y);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            char[][] image = new char[][]{new char[]{'1'}};
            int x = 0;
            int y = 0;

            int result = sol.minArea(image, x, y);
            System.out.println("Example 2: " + result);
        }
    }
}
