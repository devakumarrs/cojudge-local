import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] temps = new int[]{73, 74, 75, 71, 69, 72, 76, 73};

            int[] result = sol.dailyTemperatures(temps);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] temps = new int[]{30, 40, 50, 60};

            int[] result = sol.dailyTemperatures(temps);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
