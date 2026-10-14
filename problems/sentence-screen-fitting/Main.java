import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] sentence = new String[]{"hello", "world"};
            int rows = 2;
            int cols = 8;

            int result = sol.wordsTyping(sentence, rows, cols);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] sentence = new String[]{"a", "bcd", "e"};
            int rows = 3;
            int cols = 6;

            int result = sol.wordsTyping(sentence, rows, cols);
            System.out.println("Example 2: " + result);
        }
    }
}
