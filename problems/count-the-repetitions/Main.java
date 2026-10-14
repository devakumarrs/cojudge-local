import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s1 = "acb";
            int n1 = 4;
            String s2 = "ab";
            int n2 = 2;

            int result = sol.getMaxRepetitions(s1, n1, s2, n2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s1 = "aaa";
            int n1 = 3;
            String s2 = "aa";
            int n2 = 1;

            int result = sol.getMaxRepetitions(s1, n1, s2, n2);
            System.out.println("Example 2: " + result);
        }
    }
}
