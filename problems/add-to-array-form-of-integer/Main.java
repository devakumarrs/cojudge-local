import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] num = new int[]{1, 2, 0, 0};
            int k = 34;

            List<Integer> result = sol.addToArrayForm(num, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] num = new int[]{2, 7, 4};
            int k = 181;

            List<Integer> result = sol.addToArrayForm(num, k);
            System.out.println("Example 2: " + result);
        }
    }
}
