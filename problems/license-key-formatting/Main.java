import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "5F3Z-2e-9-w";
            int k = 4;

            String result = sol.licenseKeyFormatting(s, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "2-5g-3-J";
            int k = 2;

            String result = sol.licenseKeyFormatting(s, k);
            System.out.println("Example 2: " + result);
        }
    }
}
