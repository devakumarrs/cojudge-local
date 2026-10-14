import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] flowerbed = new int[]{1, 0, 0, 0, 1};
            int n = 1;

            boolean result = sol.canPlaceFlowers(flowerbed, n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] flowerbed = new int[]{1, 0, 0, 0, 1};
            int n = 2;

            boolean result = sol.canPlaceFlowers(flowerbed, n);
            System.out.println("Example 2: " + result);
        }
    }
}
