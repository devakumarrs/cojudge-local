import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "abcd";
            String t = "abcde";

            String result = sol.findTheDifference(s, t);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "";
            String t = "y";

            String result = sol.findTheDifference(s, t);
            System.out.println("Example 2: " + result);
        }
    }
}
