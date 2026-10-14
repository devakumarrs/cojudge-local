import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int poured = 1;
            int query_row = 1;
            int query_glass = 1;

            String result = sol.champagneTower(poured, query_row, query_glass);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int poured = 2;
            int query_row = 1;
            int query_glass = 1;

            String result = sol.champagneTower(poured, query_row, query_glass);
            System.out.println("Example 2: " + result);
        }
    }
}
