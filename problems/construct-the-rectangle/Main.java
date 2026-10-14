import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int area = 4;

            int[] result = sol.constructRectangle(area);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int area = 37;

            int[] result = sol.constructRectangle(area);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
