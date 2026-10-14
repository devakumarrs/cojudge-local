import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] sentence1 = new String[]{"great", "acting", "skills"};
            String[] sentence2 = new String[]{"fine", "drama", "talent"};
            List<List<String>> similarPairs = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList("great", "good")), new ArrayList<>(Arrays.asList("fine", "good")), new ArrayList<>(Arrays.asList("drama", "acting")), new ArrayList<>(Arrays.asList("skills", "talent"))));

            boolean result = sol.areSentencesSimilarTwo(sentence1, sentence2, similarPairs);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] sentence1 = new String[]{"great"};
            String[] sentence2 = new String[]{"fine"};
            List<List<String>> similarPairs = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList("great", "good"))));

            boolean result = sol.areSentencesSimilarTwo(sentence1, sentence2, similarPairs);
            System.out.println("Example 2: " + result);
        }
    }
}
