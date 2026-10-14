import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String dominoes = "RR.L";

            String result = sol.pushDominoes(dominoes);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String dominoes = ".L.R...LR..L..";

            String result = sol.pushDominoes(dominoes);
            System.out.println("Example 2: " + result);
        }
    }
}
