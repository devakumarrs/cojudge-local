public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            char[][] picture = new char[][]{new char[]{'W', 'W', 'B'}, new char[]{'W', 'B', 'W'}, new char[]{'B', 'W', 'W'}};

            int result = sol.findLonelyPixel(picture);
            boolean correct = runChecker(() -> new Marker().isCorrect(new char[][]{new char[]{'W', 'W', 'B'}, new char[]{'W', 'B', 'W'}, new char[]{'B', 'W', 'W'}}, result));
            verifyExample(1, correct, String.valueOf(result), "3", "picture = [[\"W\",\"W\",\"B\"],[\"W\",\"B\",\"W\"],[\"B\",\"W\",\"W\"]]", "Each black pixel sits alone in its row and column.");
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            char[][] picture = new char[][]{new char[]{'B', 'B'}, new char[]{'B', 'W'}};

            int result = sol.findLonelyPixel(picture);
            boolean correct = runChecker(() -> new Marker().isCorrect(new char[][]{new char[]{'B', 'B'}, new char[]{'B', 'W'}}, result));
            verifyExample(2, correct, String.valueOf(result), "0", "picture = [[\"B\",\"B\"],[\"B\",\"W\"]]", "Every black pixel shares its row or column with another black pixel.");
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
