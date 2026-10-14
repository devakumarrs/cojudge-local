import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue", "enQueue", "Rear"};
            int[] values = new int[]{3, 1, 2, 3, 4, 0, 0, 0, 4, 0};

            int[] result = sol.runCircularQueue(operations, values);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MyCircularQueue", "enQueue", "Rear", "Front", "deQueue", "isEmpty"};
            int[] values = new int[]{2, 7, 0, 0, 0, 0};

            int[] result = sol.runCircularQueue(operations, values);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
