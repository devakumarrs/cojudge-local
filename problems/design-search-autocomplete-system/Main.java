import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"AutocompleteSystem", "input", "input", "input", "input"};
            String[] values = new String[]{"i love you:5;island:3;ironman:2;i love leetcode:2", "i", " ", "a", "#"};

            List<List<String>> result = sol.runAutocomplete(operations, values);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"AutocompleteSystem", "input", "input"};
            String[] values = new String[]{"abc:2;abd:2;abe:2", "a", "b"};

            List<List<String>> result = sol.runAutocomplete(operations, values);
            System.out.println("Example 2: " + result);
        }
    }
}
