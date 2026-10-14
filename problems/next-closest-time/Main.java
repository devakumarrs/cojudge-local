import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String time = "19:34";

            String result = sol.nextClosestTime(time);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String time = "23:59";

            String result = sol.nextClosestTime(time);
            System.out.println("Example 2: " + result);
        }
    }
}
