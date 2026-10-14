import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MyCircularDeque", "insertLast", "insertLast", "insertFront", "insertFront", "getRear", "isFull", "deleteLast", "insertFront", "getFront"};
            int[] values = new int[]{3, 1, 2, 3, 4, 0, 0, 0, 4, 0};

            int[] result = sol.runCircularDeque(operations, values);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MyCircularDeque", "getFront", "getRear", "isEmpty", "insertFront", "isFull", "deleteFront", "isEmpty"};
            int[] values = new int[]{2, 0, 0, 0, 9, 0, 0, 0};

            int[] result = sol.runCircularDeque(operations, values);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
