import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] people = new int[]{1, 2};
            int limit = 3;

            int result = sol.numRescueBoats(people, limit);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] people = new int[]{3, 2, 2, 1};
            int limit = 3;

            int result = sol.numRescueBoats(people, limit);
            System.out.println("Example 2: " + result);
        }
    }
}
