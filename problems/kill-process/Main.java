import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] pid = new int[]{1, 3, 10, 5};
            int[] ppid = new int[]{3, 0, 5, 3};
            int kill = 5;

            List<Integer> result = sol.killProcess(pid, ppid, kill);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] pid = new int[]{1, 3, 10, 5};
            int[] ppid = new int[]{3, 0, 5, 3};
            int kill = 3;

            List<Integer> result = sol.killProcess(pid, ppid, kill);
            System.out.println("Example 2: " + result);
        }
    }
}
