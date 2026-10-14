import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String data = "[1,null,3,2,4,null,5,6]";

            String result = sol.codecRoundTrip(data);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String data = "[]";

            String result = sol.codecRoundTrip(data);
            System.out.println("Example 2: " + result);
        }
    }
}
