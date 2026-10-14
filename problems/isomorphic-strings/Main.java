import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "egg";
            String t = "add";

            boolean result = sol.isIsomorphic(s, t);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "foo";
            String t = "bar";

            boolean result = sol.isIsomorphic(s, t);
            System.out.println("Example 2: " + result);
        }
    }
}
