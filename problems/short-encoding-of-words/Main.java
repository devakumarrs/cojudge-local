import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"time", "me", "bell"};

            int result = sol.minimumLengthEncoding(words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] words = new String[]{"t"};

            int result = sol.minimumLengthEncoding(words);
            System.out.println("Example 2: " + result);
        }
    }
}
