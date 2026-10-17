import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MyCalendarTwo", "book", "book", "book", "book", "book", "book"};
            int[][] args = new int[][]{new int[]{}, new int[]{10, 20}, new int[]{50, 60}, new int[]{10, 40}, new int[]{5, 15}, new int[]{5, 10}, new int[]{25, 55}};

            int[] result = sol.runCalendarTwo(operations, args);
            boolean correct = runChecker(() -> new Marker().isCorrect(new String[]{"MyCalendarTwo", "book", "book", "book", "book", "book", "book"}, new int[][]{new int[]{}, new int[]{10, 20}, new int[]{50, 60}, new int[]{10, 40}, new int[]{5, 15}, new int[]{5, 10}, new int[]{25, 55}}, result));
            verifyExample(1, correct, Arrays.toString(result), "[1,1,1,0,1,1]", "operations = [\"MyCalendarTwo\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\"]\nargs = [[],[10,20],[50,60],[10,40],[5,15],[5,10],[25,55]]", "Only the [5,15) request would pile three bookings over [10,15).");
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"MyCalendarTwo", "book", "book", "book"};
            int[][] args = new int[][]{new int[]{}, new int[]{0, 10}, new int[]{10, 20}, new int[]{5, 15}};

            int[] result = sol.runCalendarTwo(operations, args);
            boolean correct = runChecker(() -> new Marker().isCorrect(new String[]{"MyCalendarTwo", "book", "book", "book"}, new int[][]{new int[]{}, new int[]{0, 10}, new int[]{10, 20}, new int[]{5, 15}}, result));
            verifyExample(2, correct, Arrays.toString(result), "[1,1,1]", "operations = [\"MyCalendarTwo\",\"book\",\"book\",\"book\"]\nargs = [[],[0,10],[10,20],[5,15]]", null);
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
