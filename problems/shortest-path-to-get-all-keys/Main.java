import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] grid = new String[]{"@.a..", "###.#", "b.A.B"};

            int result = sol.shortestPathAllKeys(grid);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] grid = new String[]{"@..aA", "..B#.", "....b"};

            int result = sol.shortestPathAllKeys(grid);
            System.out.println("Example 2: " + result);
        }
    }
}
