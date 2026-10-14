import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "011010";
            int minJump = 2;
            int maxJump = 3;

            boolean result = sol.canReach(s, minJump, maxJump);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "01101110";
            int minJump = 2;
            int maxJump = 3;

            boolean result = sol.canReach(s, minJump, maxJump);
            System.out.println("Example 2: " + result);
        }
    }
}
