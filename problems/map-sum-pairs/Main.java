import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"insert", "sum", "insert", "sum"};
            String[] keys = new String[]{"apple", "ap", "app", "ap"};
            int[] vals = new int[]{3, 0, 2, 0};

            int[] result = sol.runMapSum(operations, keys, vals);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"insert", "insert", "sum"};
            String[] keys = new String[]{"aa", "aa", "a"};
            int[] vals = new int[]{2, 3, 0};

            int[] result = sol.runMapSum(operations, keys, vals);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
