import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] fruits = new int[]{1, 2, 1};

            int result = sol.totalFruit(fruits);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] fruits = new int[]{0, 1, 2, 2};

            int result = sol.totalFruit(fruits);
            System.out.println("Example 2: " + result);
        }
    }
}
