import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] dictionary = new String[]{"deer", "door", "cake", "card"};
            String[] words = new String[]{"dear", "cart", "cane", "make", "cake"};

            int[] result = sol.checkAbbr(dictionary, words);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] dictionary = new String[]{"hello"};
            String[] words = new String[]{"hello", "hallo"};

            int[] result = sol.checkAbbr(dictionary, words);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
