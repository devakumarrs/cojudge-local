import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] tasks = new int[][]{new int[]{1, 2}, new int[]{2, 4}, new int[]{3, 2}, new int[]{4, 1}};

            int[] result = sol.getOrder(tasks);
            boolean correct = runChecker(() -> new Marker().isCorrect(new int[][]{new int[]{1, 2}, new int[]{2, 4}, new int[]{3, 2}, new int[]{4, 1}}, result));
            verifyExample(1, correct, Arrays.toString(result), "[0,2,3,1]", "tasks = [[1,2],[2,4],[3,2],[4,1]]", "The events go as follows: at time 1 task 0 is available, CPU processes it until time 3. At time 3 tasks 1 and 2 are available, CPU picks task 2 (shorter). At time 5 task 3 is available with tasks 1, CPU picks task 3 (shortest), then task 1.");
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] tasks = new int[][]{new int[]{7, 10}, new int[]{7, 12}, new int[]{7, 5}, new int[]{7, 4}, new int[]{7, 2}};

            int[] result = sol.getOrder(tasks);
            boolean correct = runChecker(() -> new Marker().isCorrect(new int[][]{new int[]{7, 10}, new int[]{7, 12}, new int[]{7, 5}, new int[]{7, 4}, new int[]{7, 2}}, result));
            verifyExample(2, correct, Arrays.toString(result), "[4,3,2,0,1]", "tasks = [[7,10],[7,12],[7,5],[7,4],[7,2]]", "All tasks are available at time 7. CPU picks them in order of processing time, breaking ties by index.");
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

    // Runs the problem's own judge (`Marker.isCorrect`); a crashing checker counts as a failure
    private static boolean runChecker(java.util.function.BooleanSupplier checker) {
        try {
            return checker.getAsBoolean();
        } catch (RuntimeException e) {
            System.out.println(YELLOW + "⚠ Marker.isCorrect threw " + e + RESET);
            return false;
        }
    }

    // `correct` is the checker's verdict, or null to compare `actual` against `expected` as text
    private static void verifyExample(int exampleNum, Boolean correct, String actual, String expected, String input, String explanation) {
        if (exampleNum > 1) System.out.println();
        if (correct == null && expected == null) {
            System.out.println(BOLD + CYAN + "ℹ Example " + exampleNum + RESET);
            if (input != null && !input.isEmpty()) {
                System.out.println("  " + DIM + "Input  : " + RESET + input);
            }
            System.out.println("  " + BOLD + "Actual : " + RESET + CYAN + actual + RESET);
            return;
        }

        _totalTests++;
        boolean passed = correct != null ? correct : isMatch(actual, expected);
        if (passed) {
            _passedTests++;
            System.out.println(BOLD + GREEN + "✔ Example " + exampleNum + " PASSED" + RESET);
            if (input != null && !input.isEmpty()) {
                System.out.println("  " + DIM + "Input    : " + RESET + input);
            }
            System.out.println("  " + BOLD + "Actual   : " + RESET + GREEN + actual + RESET);
            if (expected != null) {
                System.out.println("  " + DIM + "Expected : " + RESET + expected);
            }
        } else {
            System.out.println(BOLD + RED + "✘ Example " + exampleNum + " FAILED" + RESET);
            if (input != null && !input.isEmpty()) {
                System.out.println("  " + DIM + "Input       : " + RESET + input);
            }
            System.out.println("  " + BOLD + "Actual      : " + RESET + RED + actual + RESET);
            if (expected != null) {
                System.out.println("  " + BOLD + "Expected    : " + RESET + GREEN + expected + RESET);
            }
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
