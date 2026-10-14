import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"Excel", "set", "get", "sum", "get"};
            List<List<String>> args = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList("3", "3")), new ArrayList<>(Arrays.asList("1", "1", "2")), new ArrayList<>(Arrays.asList("1", "1")), new ArrayList<>(Arrays.asList("1", "2", "A1", "A2")), new ArrayList<>(Arrays.asList("1", "2"))));

            int[] result = sol.runExcel(operations, args);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"Excel", "set", "set", "sum", "get"};
            List<List<String>> args = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList("2", "2")), new ArrayList<>(Arrays.asList("1", "1", "5")), new ArrayList<>(Arrays.asList("1", "2", "7")), new ArrayList<>(Arrays.asList("2", "1", "A1", "B1")), new ArrayList<>(Arrays.asList("2", "1"))));

            int[] result = sol.runExcel(operations, args);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
