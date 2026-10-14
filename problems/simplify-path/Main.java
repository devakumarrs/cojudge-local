import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String path = "/home/";

            String result = sol.simplifyPath(path);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String path = "/home//foo/";

            String result = sol.simplifyPath(path);
            System.out.println("Example 2: " + result);
        }
    }
}
