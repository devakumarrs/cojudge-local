import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String code = "<DIV>This is the first line <![CDATA[<div>]]></DIV>";

            boolean result = sol.isValid(code);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String code = "<DIV>>>  ![cdata[]] <![CDATA[<div>]>]]>]]>>]</DIV>";

            boolean result = sol.isValid(code);
            System.out.println("Example 2: " + result);
        }
    }
}
