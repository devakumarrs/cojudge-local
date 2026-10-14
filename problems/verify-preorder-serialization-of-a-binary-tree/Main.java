import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";

            boolean result = sol.isValidSerialization(preorder);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String preorder = "1,#";

            boolean result = sol.isValidSerialization(preorder);
            System.out.println("Example 2: " + result);
        }
    }
}
