import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] strings = new String[]{"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};

            List<List<String>> result = sol.groupStrings(strings);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] strings = new String[]{"a"};

            List<List<String>> result = sol.groupStrings(strings);
            System.out.println("Example 2: " + result);
        }
    }
}
