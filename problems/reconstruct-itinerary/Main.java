import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] from = new String[]{"MUC", "JFK", "SFO", "LHR"};
            String[] to = new String[]{"LHR", "MUC", "SJC", "SFO"};

            List<String> result = sol.findItinerary(from, to);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] from = new String[]{"JFK", "JFK", "SFO", "ATL", "ATL"};
            String[] to = new String[]{"SFO", "ATL", "ATL", "JFK", "SFO"};

            List<String> result = sol.findItinerary(from, to);
            System.out.println("Example 2: " + result);
        }
    }
}
