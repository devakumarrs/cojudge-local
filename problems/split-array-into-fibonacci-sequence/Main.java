import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String num = "1101111";

            List<Integer> result = sol.splitIntoFibonacci(num);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String num = "11235813";

            List<Integer> result = sol.splitIntoFibonacci(num);
            System.out.println("Example 2: " + result);
        }
    }
}
