import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{0};

            int result = sol.subarrayBitwiseORs(arr);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] arr = new int[]{1, 1, 2};

            int result = sol.subarrayBitwiseORs(arr);
            System.out.println("Example 2: " + result);
        }
    }
}
