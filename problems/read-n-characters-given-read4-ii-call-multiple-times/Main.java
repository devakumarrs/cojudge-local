import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String file = "abc";
            int[] queries = new int[]{1, 2, 1};

            List<String> result = sol.read(file, queries);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String file = "abc";
            int[] queries = new int[]{4, 1};

            List<String> result = sol.read(file, queries);
            System.out.println("Example 2: " + result);
        }
    }
}
