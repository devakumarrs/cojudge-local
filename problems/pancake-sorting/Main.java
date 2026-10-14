import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{3, 2, 4, 1};

            List<Integer> result = sol.pancakeSort(arr);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{3, 2, 1};

            List<Integer> result = sol.pancakeSort(arr);
            System.out.println("Example 2: " + result);
        }
    }
}
