import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String jewels = "aA";
            String stones = "aAAbbbb";

            int result = sol.numJewelsInStones(jewels, stones);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String jewels = "z";
            String stones = "ZZ";

            int result = sol.numJewelsInStones(jewels, stones);
            System.out.println("Example 2: " + result);
        }
    }
}
