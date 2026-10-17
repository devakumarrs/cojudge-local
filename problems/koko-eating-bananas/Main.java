public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] piles = new int[]{3, 6, 7, 11};
            int h = 8;

            int result = sol.minEatingSpeed(piles, h);
            boolean correct = runChecker(() -> new Marker().isCorrect(new int[]{3, 6, 7, 11}, 8, result));
            verifyExample(1, correct, String.valueOf(result), "4", "piles = [3,6,7,11], h = 8", "At 4 bananas/hour Koko takes ceil(3/4)+ceil(6/4)+ceil(7/4)+ceil(11/4) = 1+2+2+3 = 8 hours; at 3 bananas/hour she would take 1+2+3+4 = 10 hours, exceeding the 8-hour limit.");
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] piles = new int[]{30, 11, 23, 4, 20};
            int h = 5;

            int result = sol.minEatingSpeed(piles, h);
            boolean correct = runChecker(() -> new Marker().isCorrect(new int[]{30, 11, 23, 4, 20}, 5, result));
            verifyExample(2, correct, String.valueOf(result), "30", "piles = [30,11,23,4,20], h = 5", "At 30 bananas/hour Koko takes ceil(30/30)+ceil(11/30)+ceil(23/30)+ceil(4/30)+ceil(20/30) = 1+1+1+1+1 = 5 hours; at 29 bananas/hour she would take 2+1+1+1+1 = 6 hours, exceeding the 5-hour limit.");
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
