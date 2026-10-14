import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] g = new int[]{1, 2, 3};
            int[] s = new int[]{1, 1};

            int result = sol.findContentChildren(g, s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] g = new int[]{1, 2};
            int[] s = new int[]{1, 2, 3};

            int result = sol.findContentChildren(g, s);
            System.out.println("Example 2: " + result);
        }
    }
}
