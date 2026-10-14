import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] quality = new int[]{10, 20, 5};
            int[] wage = new int[]{70, 50, 30};
            int k = 2;

            String result = sol.mincostToHireWorkers(quality, wage, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] quality = new int[]{3, 1, 10, 10, 1};
            int[] wage = new int[]{4, 8, 2, 2, 7};
            int k = 3;

            String result = sol.mincostToHireWorkers(quality, wage, k);
            System.out.println("Example 2: " + result);
        }
    }
}
