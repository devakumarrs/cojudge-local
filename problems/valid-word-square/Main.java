import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"abcd", "bnrt", "crmy", "dtye"};

            boolean result = sol.validWordSquare(words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"ball", "area", "read", "lady"};

            boolean result = sol.validWordSquare(words);
            System.out.println("Example 2: " + result);
        }
    }
}
