import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String bottom = "BCD";
            String[] allowed = new String[]{"BCC", "CDE", "CEA", "FFF"};

            boolean result = sol.pyramidTransition(bottom, allowed);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String bottom = "AAAA";
            String[] allowed = new String[]{"AAB", "AAC", "BCD", "BBE", "DEF"};

            boolean result = sol.pyramidTransition(bottom, allowed);
            System.out.println("Example 2: " + result);
        }
    }
}
