import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int buckets = 1000;
            int minutesToDie = 15;
            int minutesToTest = 60;

            int result = sol.poorPigs(buckets, minutesToDie, minutesToTest);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int buckets = 4;
            int minutesToDie = 15;
            int minutesToTest = 15;

            int result = sol.poorPigs(buckets, minutesToDie, minutesToTest);
            System.out.println("Example 2: " + result);
        }
    }
}
