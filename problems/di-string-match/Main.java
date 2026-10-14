import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "IDID";

            int[] result = sol.diStringMatch(s);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "III";

            int[] result = sol.diStringMatch(s);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
