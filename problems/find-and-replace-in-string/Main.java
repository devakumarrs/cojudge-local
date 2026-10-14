import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "abcd";
            int[] indices = new int[]{0, 2};
            String[] sources = new String[]{"a", "cd"};
            String[] targets = new String[]{"eee", "ffff"};

            String result = sol.findReplaceString(s, indices, sources, targets);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "abcd";
            int[] indices = new int[]{0, 2};
            String[] sources = new String[]{"ab", "ec"};
            String[] targets = new String[]{"eee", "ffff"};

            String result = sol.findReplaceString(s, indices, sources, targets);
            System.out.println("Example 2: " + result);
        }
    }
}
