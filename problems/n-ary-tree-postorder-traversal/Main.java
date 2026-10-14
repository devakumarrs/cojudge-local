import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String data = "[1,null,3,2,4,null,5,6]";

            List<Integer> result = sol.postorder(data);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String data = "[1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]";

            List<Integer> result = sol.postorder(data);
            System.out.println("Example 2: " + result);
        }
    }
}
