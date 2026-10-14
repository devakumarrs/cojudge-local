import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] boxes = new int[]{1, 3, 2, 2, 2, 3, 4, 3, 1};

            int result = sol.removeBoxes(boxes);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] boxes = new int[]{1, 1, 1};

            int result = sol.removeBoxes(boxes);
            System.out.println("Example 2: " + result);
        }
    }
}
