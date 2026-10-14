import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] ages = new int[]{16, 16};

            int result = sol.numFriendRequests(ages);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] ages = new int[]{16, 17, 18};

            int result = sol.numFriendRequests(ages);
            System.out.println("Example 2: " + result);
        }
    }
}
