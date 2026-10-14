import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 7;
            int[] blacklist = new int[]{2, 3, 5};
            int[] calls = new int[]{0, 1, 2, 3};

            int[] result = sol.runBlacklist(n, blacklist, calls);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 4;
            int[] blacklist = new int[]{2};
            int[] calls = new int[]{0, 1, 2};

            int[] result = sol.runBlacklist(n, blacklist, calls);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
