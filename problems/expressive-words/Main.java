import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "heeellooo";
            String[] words = new String[]{"hello", "hi", "helo"};

            int result = sol.expressiveWords(s, words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "zzzzzyyyy";
            String[] words = new String[]{"zzyy", "zy", "zyyy"};

            int result = sol.expressiveWords(s, words);
            System.out.println("Example 2: " + result);
        }
    }
}
