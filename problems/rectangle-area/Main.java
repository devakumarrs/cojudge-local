import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int ax1 = -3;
            int ay1 = 0;
            int ax2 = 3;
            int ay2 = 4;
            int bx1 = 0;
            int by1 = -1;
            int bx2 = 9;
            int by2 = 2;

            int result = sol.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int ax1 = -2;
            int ay1 = -2;
            int ax2 = 2;
            int ay2 = 2;
            int bx1 = -2;
            int by1 = -2;
            int bx2 = 2;
            int by2 = 2;

            int result = sol.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
            System.out.println("Example 2: " + result);
        }
    }
}
