import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] stickers = new String[]{"with", "example", "science"};
            String target = "thehat";

            int result = sol.minStickers(stickers, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] stickers = new String[]{"notice", "possible"};
            String target = "basicbasic";

            int result = sol.minStickers(stickers, target);
            System.out.println("Example 2: " + result);
        }
    }
}
