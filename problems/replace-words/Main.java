import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] dictionary = new String[]{"cat", "bat", "rat"};
            String sentence = "the cattle was rattled by the battery";

            String result = sol.replaceWords(dictionary, sentence);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] dictionary = new String[]{"a", "b", "c"};
            String sentence = "aadsfasf absbs bbab cadsfafs";

            String result = sol.replaceWords(dictionary, sentence);
            System.out.println("Example 2: " + result);
        }
    }
}
