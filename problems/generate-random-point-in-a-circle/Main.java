import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String radius = "1.0";
            String xCenter = "0.0";
            String yCenter = "0.0";

            List<String> result = sol.randPoint(radius, xCenter, yCenter);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String radius = "2.0";
            String xCenter = "3.0";
            String yCenter = "-1.0";

            List<String> result = sol.randPoint(radius, xCenter, yCenter);
            System.out.println("Example 2: " + result);
        }
    }
}
