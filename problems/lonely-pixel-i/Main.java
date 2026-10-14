import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            char[][] picture = new char[][]{new char[]{'W', 'W', 'B'}, new char[]{'W', 'B', 'W'}, new char[]{'B', 'W', 'W'}};

            int result = sol.findLonelyPixel(picture);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            char[][] picture = new char[][]{new char[]{'B', 'B'}, new char[]{'B', 'W'}};

            int result = sol.findLonelyPixel(picture);
            System.out.println("Example 2: " + result);
        }
    }
}
