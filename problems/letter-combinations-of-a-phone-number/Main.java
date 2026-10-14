import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String digits = "23";

            List<String> result = sol.letterCombinations(digits);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String digits = "7";

            List<String> result = sol.letterCombinations(digits);
            System.out.println("Example 2: " + result);
        }
    }
}
