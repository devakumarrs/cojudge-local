import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "abc";
            int[] shifts = new int[]{3, 5, 9};

            String result = sol.shiftingLetters(s, shifts);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "aaa";
            int[] shifts = new int[]{1, 2, 3};

            String result = sol.shiftingLetters(s, shifts);
            System.out.println("Example 2: " + result);
        }
    }
}
