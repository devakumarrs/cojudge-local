import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{9, 4, 2, 10, 7, 8, 8, 1, 9};

            int result = sol.maxTurbulenceSize(arr);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{4, 8, 12, 16};

            int result = sol.maxTurbulenceSize(arr);
            System.out.println("Example 2: " + result);
        }
    }
}
