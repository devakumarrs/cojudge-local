import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            char[][] picture = new char[][]{new char[]{'W', 'B', 'W', 'B', 'B', 'W'}, new char[]{'W', 'B', 'W', 'B', 'B', 'W'}, new char[]{'W', 'B', 'W', 'B', 'B', 'W'}, new char[]{'W', 'W', 'B', 'W', 'B', 'W'}};
            int n = 3;

            int result = sol.findBlackPixel(picture, n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            char[][] picture = new char[][]{new char[]{'W', 'B', 'W'}, new char[]{'B', 'W', 'W'}};
            int n = 1;

            int result = sol.findBlackPixel(picture, n);
            System.out.println("Example 2: " + result);
        }
    }
}
