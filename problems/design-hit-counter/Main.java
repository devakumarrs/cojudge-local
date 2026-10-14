import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"HitCounter", "hit", "hit", "hit", "getHits", "hit", "getHits", "getHits"};
            int[] timestamps = new int[]{0, 1, 2, 3, 4, 300, 300, 301};

            int[] result = sol.runHitCounter(operations, timestamps);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"HitCounter", "hit", "getHits", "getHits"};
            int[] timestamps = new int[]{0, 5, 5, 305};

            int[] result = sol.runHitCounter(operations, timestamps);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
