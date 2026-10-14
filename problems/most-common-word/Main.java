import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
            String[] banned = new String[]{"hit"};

            String result = sol.mostCommonWord(paragraph, banned);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String paragraph = "a.";
            String[] banned = new String[]{};

            String result = sol.mostCommonWord(paragraph, banned);
            System.out.println("Example 2: " + result);
        }
    }
}
