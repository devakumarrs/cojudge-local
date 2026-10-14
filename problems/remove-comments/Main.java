import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] source = new String[]{"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"};

            List<String> result = sol.removeComments(source);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] source = new String[]{"a/*comment", "line", "more_comment*/b"};

            List<String> result = sol.removeComments(source);
            System.out.println("Example 2: " + result);
        }
    }
}
