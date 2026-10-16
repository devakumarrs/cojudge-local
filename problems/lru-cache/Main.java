import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"};
            int[][] args = new int[][]{new int[]{2}, new int[]{1, 1}, new int[]{2, 2}, new int[]{1}, new int[]{3, 3}, new int[]{2}, new int[]{4, 4}, new int[]{1}, new int[]{3}, new int[]{4}};

            int[] result = sol.runLruCache(operations, args);
            verifyExample(1, Arrays.toString(result), "[1,-1,-1,3,4]", "operations = [\"LRUCache\",\"put\",\"put\",\"get\",\"put\",\"get\",\"put\",\"get\",\"get\",\"get\"], args = [[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]", "Capacity is 2; after putting (1,1) and (2,2), key 1 is still cached so get(1) returns 1. Putting (3,3) evicts key 2, making get(2) return -1. Putting (4,4) evicts key 1, so get(1) returns -1, while keys 3 and 4 remain cached.");
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"LRUCache", "put", "get", "put", "get", "get"};
            int[][] args = new int[][]{new int[]{1}, new int[]{2, 1}, new int[]{2}, new int[]{3, 2}, new int[]{2}, new int[]{3}};

            int[] result = sol.runLruCache(operations, args);
            verifyExample(2, Arrays.toString(result), "[1,-1,2]", "operations = [\"LRUCache\",\"put\",\"get\",\"put\",\"get\",\"get\"], args = [[1],[2,1],[2],[3,2],[2],[3]]", "Capacity is 1; after putting (2,1), get(2) returns 1. Then put(3,2) evicts key 2, so get(2) returns -1, but get(3) returns 2.");
        }

        printTestSummary();
    }

    // --- Unit Test & Colored Output Helpers ---
    private static int _totalTests = 0;
    private static int _passedTests = 0;

    private static final String RESET  = "\033[0m";
    private static final String BOLD   = "\033[1m";
    private static final String DIM    = "\033[2m";
    private static final String RED    = "\033[0;31m";
    private static final String GREEN  = "\033[0;32m";
    private static final String YELLOW = "\033[1;33m";
    private static final String CYAN   = "\033[0;36m";

    private static String normalizeOutput(String s) {
        if (s == null) return "null";
        String t = s.trim();
        if (t.length() >= 2 && ((t.startsWith("\"") && t.endsWith("\"")) || (t.startsWith("'") && t.endsWith("'")))) {
            t = t.substring(1, t.length() - 1);
        }
        if (t.startsWith("[") && t.endsWith("]")) {
            return t.replaceAll("[\\s\"]+", "");
        }
        return t;
    }

    private static boolean isMatch(String actual, String expected) {
        if (actual == null || expected == null) return actual == expected;
        if (actual.trim().equals(expected.trim())) return true;
        String normActual = normalizeOutput(actual);
        String normExpected = normalizeOutput(expected);
        if (normActual.equals(normExpected)) return true;
        if (normActual.equalsIgnoreCase(normExpected)
                && (normActual.equalsIgnoreCase("true") || normActual.equalsIgnoreCase("false"))) {
            return true;
        }
        try {
            double dActual = Double.parseDouble(normActual);
            double dExpected = Double.parseDouble(normExpected);
            return Math.abs(dActual - dExpected) <= 1e-5;
        } catch (NumberFormatException ignored) {
        }
        return false;
    }

    private static void verifyExample(int exampleNum, String actual, String expected, String input, String explanation) {
        if (exampleNum > 1) System.out.println();
        if (expected == null) {
            System.out.println(BOLD + CYAN + "ℹ Example " + exampleNum + RESET);
            if (input != null && !input.isEmpty()) {
                System.out.println("  " + DIM + "Input  : " + RESET + input);
            }
            System.out.println("  " + BOLD + "Actual : " + RESET + CYAN + actual + RESET);
            return;
        }

        _totalTests++;
        boolean passed = isMatch(actual, expected);
        if (passed) {
            _passedTests++;
            System.out.println(BOLD + GREEN + "✔ Example " + exampleNum + " PASSED" + RESET);
            if (input != null && !input.isEmpty()) {
                System.out.println("  " + DIM + "Input    : " + RESET + input);
            }
            System.out.println("  " + BOLD + "Actual   : " + RESET + GREEN + actual + RESET);
            System.out.println("  " + DIM + "Expected : " + RESET + expected);
        } else {
            System.out.println(BOLD + RED + "✘ Example " + exampleNum + " FAILED" + RESET);
            if (input != null && !input.isEmpty()) {
                System.out.println("  " + DIM + "Input       : " + RESET + input);
            }
            System.out.println("  " + BOLD + "Actual      : " + RESET + RED + actual + RESET);
            System.out.println("  " + BOLD + "Expected    : " + RESET + GREEN + expected + RESET);
            if (explanation != null && !explanation.isEmpty()) {
                System.out.println("  " + YELLOW + "💡 Explanation : " + RESET + explanation);
            }
        }
    }

    private static void printTestSummary() {
        if (_totalTests == 0) return;
        System.out.println("\n" + DIM + "────────────────────────────────────────" + RESET);
        if (_passedTests == _totalTests) {
            System.out.println(BOLD + GREEN + "✔ All " + _passedTests + "/" + _totalTests + " example test(s) passed!" + RESET);
        } else {
            System.out.println(BOLD + RED + "✘ " + _passedTests + "/" + _totalTests + " example test(s) passed." + RESET);
        }
    }
}
