import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String color = "#09f166";

            String result = sol.similarRGB(color);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String color = "#000000";

            String result = sol.similarRGB(color);
            System.out.println("Example 2: " + result);
        }
    }
}
