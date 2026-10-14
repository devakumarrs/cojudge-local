import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] fronts = new int[]{1, 2, 4, 4, 7};
            int[] backs = new int[]{1, 3, 4, 1, 3};

            int result = sol.flipgame(fronts, backs);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] fronts = new int[]{1};
            int[] backs = new int[]{1};

            int result = sol.flipgame(fronts, backs);
            System.out.println("Example 2: " + result);
        }
    }
}
