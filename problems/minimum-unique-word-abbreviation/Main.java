import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String target = "apple";
            String[] dictionary = new String[]{"blade"};

            String result = sol.minAbbreviation(target, dictionary);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String target = "apple";
            String[] dictionary = new String[]{"plain", "amber", "blade"};

            String result = sol.minAbbreviation(target, dictionary);
            System.out.println("Example 2: " + result);
        }
    }
}
