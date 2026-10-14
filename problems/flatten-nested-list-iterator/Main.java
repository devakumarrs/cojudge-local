import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String nestedList = "[[1,1],2,[1,1]]";

            int[] result = sol.flattenNestedList(nestedList);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String nestedList = "[1,[4,[6]]]";

            int[] result = sol.flattenNestedList(nestedList);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
