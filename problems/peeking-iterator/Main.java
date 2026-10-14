import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3};
            String[] operations = new String[]{"next", "peek", "next", "next", "hasNext"};

            int[] result = sol.runPeek(nums, operations);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1};
            String[] operations = new String[]{"hasNext", "next", "hasNext"};

            int[] result = sol.runPeek(nums, operations);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
