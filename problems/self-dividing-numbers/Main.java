import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int left = 1;
            int right = 22;

            List<Integer> result = sol.selfDividingNumbers(left, right);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int left = 47;
            int right = 85;

            List<Integer> result = sol.selfDividingNumbers(left, right);
            System.out.println("Example 2: " + result);
        }
    }
}
