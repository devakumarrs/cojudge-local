import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"5", "2", "C", "D", "+"};

            int result = sol.calPoints(operations);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};

            int result = sol.calPoints(operations);
            System.out.println("Example 2: " + result);
        }
    }
}
