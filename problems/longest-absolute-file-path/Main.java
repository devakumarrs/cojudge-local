import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String input = "dir|	subdir1|	subdir2|		file.ext";

            int result = sol.lengthLongestPath(input);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String input = "dir|	subdir1|		file1.ext|		subsubdir1|	subdir2|		subsubdir2|			file2.ext";

            int result = sol.lengthLongestPath(input);
            System.out.println("Example 2: " + result);
        }
    }
}
