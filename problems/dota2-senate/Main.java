import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String senate = "RD";

            String result = sol.predictPartyVictory(senate);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String senate = "RDD";

            String result = sol.predictPartyVictory(senate);
            System.out.println("Example 2: " + result);
        }
    }
}
