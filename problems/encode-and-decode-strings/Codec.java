import java.util.*;

public class Codec {
    // Encodes a list of strings to a single string.
    public String encode(String[] strs) {
        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            result.append(str.length()).append('#').append(str);
        }
        return result.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int n = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                n = 0;
                while (Character.isDigit(s.charAt(i))) {
                    n = 10 * n + s.charAt(i) - '0';
                    i++;
                }
                result.add(s.substring(i + 1, i + 1 + n));
                i = i + 1 + n;
            }
        }
        return result;
    }
}