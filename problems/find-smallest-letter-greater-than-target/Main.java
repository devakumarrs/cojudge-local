import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] letters = new String[]{"c", "f", "j"};
            String target = "a";

            String result = sol.nextGreatestLetter(letters, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] letters = new String[]{"c", "f", "j"};
            String target = "c";

            String result = sol.nextGreatestLetter(letters, target);
            System.out.println("Example 2: " + result);
        }
    }
}
