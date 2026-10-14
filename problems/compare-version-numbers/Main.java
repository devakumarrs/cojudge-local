import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String version1 = "1.2";
            String version2 = "1.10";

            int result = sol.compareVersion(version1, version2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String version1 = "1.01";
            String version2 = "1.001";

            int result = sol.compareVersion(version1, version2);
            System.out.println("Example 2: " + result);
        }
    }
}
