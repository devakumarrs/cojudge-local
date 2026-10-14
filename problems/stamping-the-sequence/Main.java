import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String stamp = "abc";
            String target = "ababc";

            int[] result = sol.movesToStamp(stamp, target);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String stamp = "abca";
            String target = "aabcaca";

            int[] result = sol.movesToStamp(stamp, target);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
