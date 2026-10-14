import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String startGene = "AACCGGTT";
            String endGene = "AACCGGTA";
            String[] bank = new String[]{"AACCGGTA"};

            int result = sol.minMutation(startGene, endGene, bank);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String startGene = "AACCGGTT";
            String endGene = "AAACGGTA";
            String[] bank = new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"};

            int result = sol.minMutation(startGene, endGene, bank);
            System.out.println("Example 2: " + result);
        }
    }
}
