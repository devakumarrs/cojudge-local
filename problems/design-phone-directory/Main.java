import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"PhoneDirectory", "get", "get", "check", "get", "check", "release", "check"};
            int[][] args = new int[][]{new int[]{3}, new int[]{}, new int[]{}, new int[]{2}, new int[]{}, new int[]{2}, new int[]{2}, new int[]{2}};

            int[] result = sol.runPhoneDirectory(operations, args);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"PhoneDirectory", "get", "check", "release", "get"};
            int[][] args = new int[][]{new int[]{1}, new int[]{}, new int[]{0}, new int[]{0}, new int[]{}};

            int[] result = sol.runPhoneDirectory(operations, args);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
