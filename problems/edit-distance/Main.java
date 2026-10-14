import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String word1 = "horse";
            String word2 = "ros";

            int result = sol.minDistance(word1, word2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String word1 = "intention";
            String word2 = "execution";

            int result = sol.minDistance(word1, word2);
            System.out.println("Example 2: " + result);
        }
    }
}
