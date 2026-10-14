import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"Twitter", "postTweet", "getNewsFeed", "follow", "postTweet", "getNewsFeed", "unfollow", "getNewsFeed"};
            int[][] args = new int[][]{new int[]{}, new int[]{1, 5}, new int[]{1}, new int[]{1, 2}, new int[]{2, 6}, new int[]{1}, new int[]{1, 2}, new int[]{1}};

            int[][] result = sol.runTwitter(operations, args);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"Twitter", "postTweet", "postTweet", "getNewsFeed"};
            int[][] args = new int[][]{new int[]{}, new int[]{1, 10}, new int[]{1, 11}, new int[]{1}};

            int[][] result = sol.runTwitter(operations, args);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
