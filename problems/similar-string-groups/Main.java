import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] strs = new String[]{"tars", "rats", "arts", "star"};

            int result = sol.numSimilarGroups(strs);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] strs = new String[]{"omv", "ovm"};

            int result = sol.numSimilarGroups(strs);
            System.out.println("Example 2: " + result);
        }
    }
}
