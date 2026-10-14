import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "anagram";
            String t = "nagaram";

            boolean result = sol.isAnagram(s, t);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "rat";
            String t = "car";

            boolean result = sol.isAnagram(s, t);
            System.out.println("Example 2: " + result);
        }
    }
}
