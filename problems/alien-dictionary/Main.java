import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"wrt", "wrf", "er", "ett", "rftt"};

            String result = sol.alienOrder(words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"z", "x"};

            String result = sol.alienOrder(words);
            System.out.println("Example 2: " + result);
        }
    }
}
