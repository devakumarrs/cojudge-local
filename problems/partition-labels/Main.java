import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String s = "ababcbacadefegdehijhklij";

            int[] result = sol.partitionLabels(s);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String s = "eccbbbbdec";

            int[] result = sol.partitionLabels(s);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
