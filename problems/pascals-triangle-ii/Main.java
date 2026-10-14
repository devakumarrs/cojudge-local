import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int rowIndex = 3;

            int[] result = sol.getRow(rowIndex);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int rowIndex = 0;

            int[] result = sol.getRow(rowIndex);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
