import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] stations = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int k = 9;

            String result = sol.minmaxGasDist(stations, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] stations = new int[]{23, 24, 36, 39, 46, 56, 57, 65, 84, 98};
            int k = 1;

            String result = sol.minmaxGasDist(stations, k);
            System.out.println("Example 2: " + result);
        }
    }
}
