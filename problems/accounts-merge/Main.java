import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            List<List<String>> accounts = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com")), new ArrayList<>(Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com")), new ArrayList<>(Arrays.asList("Mary", "mary@mail.com")), new ArrayList<>(Arrays.asList("John", "johnnybravo@mail.com"))));

            List<List<String>> result = sol.accountsMerge(accounts);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            List<List<String>> accounts = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList("Gabe", "Gabe0@m.co", "Gabe3@m.co", "Gabe1@m.co")), new ArrayList<>(Arrays.asList("Kevin", "Kevin3@m.co", "Kevin5@m.co", "Kevin0@m.co")), new ArrayList<>(Arrays.asList("Ethan", "Ethan5@m.co", "Ethan4@m.co", "Ethan0@m.co")), new ArrayList<>(Arrays.asList("Hanzo", "Hanzo3@m.co", "Hanzo1@m.co", "Hanzo0@m.co")), new ArrayList<>(Arrays.asList("Fern", "Fern5@m.co", "Fern1@m.co", "Fern0@m.co"))));

            List<List<String>> result = sol.accountsMerge(accounts);
            System.out.println("Example 2: " + result);
        }
    }
}
