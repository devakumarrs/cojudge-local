import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] persons = new int[]{0, 1, 1, 0, 0, 1, 0};
            int[] times = new int[]{0, 5, 10, 15, 20, 25, 30};
            int[] queries = new int[]{3, 12, 25, 15, 24, 8};

            int[] result = sol.runElection(persons, times, queries);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] persons = new int[]{0, 0, 0, 1, 1};
            int[] times = new int[]{0, 10, 20, 30, 40};
            int[] queries = new int[]{0, 10, 25, 40};

            int[] result = sol.runElection(persons, times, queries);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
