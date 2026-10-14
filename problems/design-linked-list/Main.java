import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"};
            int[][] args = new int[][]{new int[]{}, new int[]{1}, new int[]{3}, new int[]{1, 2}, new int[]{1}, new int[]{1}, new int[]{1}};

            int[] result = sol.runLinkedList(operations, args);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MyLinkedList", "addAtHead", "get"};
            int[][] args = new int[][]{new int[]{}, new int[]{5}, new int[]{0}};

            int[] result = sol.runLinkedList(operations, args);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
