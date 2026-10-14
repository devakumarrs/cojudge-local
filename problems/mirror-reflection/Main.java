import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int p = 2;
            int q = 1;

            int result = sol.mirrorReflection(p, q);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int p = 3;
            int q = 1;

            int result = sol.mirrorReflection(p, q);
            System.out.println("Example 2: " + result);
        }
    }
}
