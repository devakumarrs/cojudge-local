import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 2;
            int[][] trust = new int[][]{new int[]{1, 2}};

            int result = sol.findJudge(n, trust);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 3;
            int[][] trust = new int[][]{new int[]{1, 3}, new int[]{2, 3}};

            int result = sol.findJudge(n, trust);
            System.out.println("Example 2: " + result);
        }
    }
}
