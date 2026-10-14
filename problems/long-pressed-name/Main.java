import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String name = "alex";
            String typed = "aaleex";

            boolean result = sol.isLongPressedName(name, typed);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String name = "saeed";
            String typed = "ssaaedd";

            boolean result = sol.isLongPressedName(name, typed);
            System.out.println("Example 2: " + result);
        }
    }
}
