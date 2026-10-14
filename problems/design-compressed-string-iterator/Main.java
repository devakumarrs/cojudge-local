import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String compressed = "L1e2t1C1o1d1e1";
            String[] operations = new String[]{"next", "next", "next", "next", "next", "hasNext", "next", "hasNext"};

            List<String> result = sol.runCompressedIterator(compressed, operations);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String compressed = "x3";
            String[] operations = new String[]{"next", "next", "next", "next", "hasNext"};

            List<String> result = sol.runCompressedIterator(compressed, operations);
            System.out.println("Example 2: " + result);
        }
    }
}
