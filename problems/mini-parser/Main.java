import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "324";

            String result = sol.deserialize(s);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "[123,[456,[789]]]";

            String result = sol.deserialize(s);
            System.out.println("Example 2: " + result);
        }
    }
}
