import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] data = new int[]{197, 130, 1};

            boolean result = sol.validUtf8(data);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] data = new int[]{235, 140, 4};

            boolean result = sol.validUtf8(data);
            System.out.println("Example 2: " + result);
        }
    }
}
