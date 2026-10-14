import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] houses = new int[]{1, 2, 3};
            int[] heaters = new int[]{2};

            int result = sol.findRadius(houses, heaters);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] houses = new int[]{1, 2, 3, 4};
            int[] heaters = new int[]{1, 4};

            int result = sol.findRadius(houses, heaters);
            System.out.println("Example 2: " + result);
        }
    }
}
