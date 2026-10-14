import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String haystack = "sadbutsad";
            String needle = "sad";

            int result = sol.strStr(haystack, needle);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String haystack = "leetcode";
            String needle = "leeto";

            int result = sol.strStr(haystack, needle);
            System.out.println("Example 2: " + result);
        }
    }
}
