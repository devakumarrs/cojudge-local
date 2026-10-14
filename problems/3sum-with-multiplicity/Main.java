import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
            int target = 8;

            int result = sol.threeSumMulti(arr, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{1, 1, 2, 2, 2, 2};
            int target = 5;

            int result = sol.threeSumMulti(arr, target);
            System.out.println("Example 2: " + result);
        }
    }
}
