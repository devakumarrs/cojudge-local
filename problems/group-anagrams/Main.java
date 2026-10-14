import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

            List<List<String>> result = sol.groupAnagrams(strs);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] strs = new String[]{""};

            List<List<String>> result = sol.groupAnagrams(strs);
            System.out.println("Example 2: " + result);
        }
    }
}
