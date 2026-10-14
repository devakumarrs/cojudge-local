import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int x = 1;
            int y = 4;

            int result = sol.hammingDistance(x, y);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int x = 3;
            int y = 1;

            int result = sol.hammingDistance(x, y);
            System.out.println("Example 2: " + result);
        }
    }
}
