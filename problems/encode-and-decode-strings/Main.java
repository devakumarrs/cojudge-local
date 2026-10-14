import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Codec obj = new Codec();
            String[] strs = new String[]{"hello", "world"};
            String _encoded = obj.encode(strs);
            List<String> _result = obj.decode(_encoded);
            System.out.println("Example 1: " + _result);
        }

        // --- Example 2 ---
        {
            Codec obj = new Codec();
            String[] strs = new String[]{""};
            String _encoded = obj.encode(strs);
            List<String> _result = obj.decode(_encoded);
            System.out.println("Example 2: " + _result);
        }
    }
}
