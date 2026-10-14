import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "loveleetcode";
            String c = "e";

            int[] result = sol.shortestToChar(s, c);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "aaab";
            String c = "b";

            int[] result = sol.shortestToChar(s, c);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
