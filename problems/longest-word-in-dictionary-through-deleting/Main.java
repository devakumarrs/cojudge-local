import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "abpcplea";
            String[] dictionary = new String[]{"ale", "apple", "monkey", "plea"};

            String result = sol.findLongestWord(s, dictionary);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "abpcplea";
            String[] dictionary = new String[]{"a", "b", "c"};

            String result = sol.findLongestWord(s, dictionary);
            System.out.println("Example 2: " + result);
        }
    }
}
