import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String licensePlate = "1s3 PSt";
            String[] words = new String[]{"step", "steps", "stripe", "stepple"};

            String result = sol.shortestCompletingWord(licensePlate, words);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String licensePlate = "1s3 456";
            String[] words = new String[]{"looks", "pest", "stew", "show"};

            String result = sol.shortestCompletingWord(licensePlate, words);
            System.out.println("Example 2: " + result);
        }
    }
}
