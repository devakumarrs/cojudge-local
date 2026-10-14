import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s1 = "aabcc";
            String s2 = "dbbca";
            String s3 = "aadbbcbcac";

            boolean result = sol.isInterleave(s1, s2, s3);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s1 = "aabcc";
            String s2 = "dbbca";
            String s3 = "aadbbbaccc";

            boolean result = sol.isInterleave(s1, s2, s3);
            System.out.println("Example 2: " + result);
        }
    }
}
