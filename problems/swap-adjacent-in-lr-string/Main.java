import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String start = "RXXLRXRXL";
            String end = "XRLXXRRLX";

            boolean result = sol.canTransform(start, end);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String start = "X";
            String end = "L";

            boolean result = sol.canTransform(start, end);
            System.out.println("Example 2: " + result);
        }
    }
}
