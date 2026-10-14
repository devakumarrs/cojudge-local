import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String formula = "H2O";

            String result = sol.countOfAtoms(formula);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String formula = "Mg(OH)2";

            String result = sol.countOfAtoms(formula);
            System.out.println("Example 2: " + result);
        }
    }
}
