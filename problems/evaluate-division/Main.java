import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            List<List<String>> equations = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList("a", "b")), new ArrayList<>(Arrays.asList("b", "c"))));
            String[] values = new String[]{"2.0", "3.0"};
            List<List<String>> queries = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList("a", "c")), new ArrayList<>(Arrays.asList("b", "a")), new ArrayList<>(Arrays.asList("a", "e")), new ArrayList<>(Arrays.asList("a", "a")), new ArrayList<>(Arrays.asList("x", "x"))));

            List<String> result = sol.calcEquation(equations, values, queries);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            List<List<String>> equations = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList("a", "b")), new ArrayList<>(Arrays.asList("b", "c")), new ArrayList<>(Arrays.asList("bc", "cd"))));
            String[] values = new String[]{"1.5", "2.5", "5.0"};
            List<List<String>> queries = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList("a", "c")), new ArrayList<>(Arrays.asList("c", "b")), new ArrayList<>(Arrays.asList("bc", "cd")), new ArrayList<>(Arrays.asList("cd", "bc"))));

            List<String> result = sol.calcEquation(equations, values, queries);
            System.out.println("Example 2: " + result);
        }
    }
}
