import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String ransomNote = "a";
            String magazine = "b";

            boolean result = sol.canConstruct(ransomNote, magazine);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String ransomNote = "aa";
            String magazine = "ab";

            boolean result = sol.canConstruct(ransomNote, magazine);
            System.out.println("Example 2: " + result);
        }
    }
}
