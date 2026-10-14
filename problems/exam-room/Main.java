import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"ExamRoom", "seat", "seat", "seat", "leave", "seat"};
            int[] values = new int[]{10, 0, 0, 0, 4, 0};

            int[] result = sol.runExamRoom(operations, values);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"ExamRoom", "seat", "seat", "leave", "seat"};
            int[] values = new int[]{4, 0, 0, 0, 0};

            int[] result = sol.runExamRoom(operations, values);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
