import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"FileSystem", "mkdir", "ls", "addContentToFile", "readContentFromFile", "ls"};
            String[] paths = new String[]{"/", "/a/b/c", "/", "/a/b/c/d", "/a/b/c/d", "/a/b/c"};
            String[] contents = new String[]{"", "", "", "hello", "", ""};

            List<List<String>> result = sol.runFileSystem(operations, paths, contents);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] operations = new String[]{"FileSystem", "mkdir", "ls", "addContentToFile", "ls", "readContentFromFile"};
            String[] paths = new String[]{"/", "/x/y", "/", "/x/y/f", "/x/y", "/x/y/f"};
            String[] contents = new String[]{"", "", "", "data", "", ""};

            List<List<String>> result = sol.runFileSystem(operations, paths, contents);
            System.out.println("Example 2: " + result);
        }
    }
}
