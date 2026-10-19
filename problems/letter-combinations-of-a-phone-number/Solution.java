import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, List<Character>> map = new HashMap<>();
        char chVal = 'a';
        for (int i = 2; i <= 9; i++) {
            char chKey = (char) (i + '0');
            int limit = i == 7 || i == 9 ? 4 : 3;
            for (int j = 0; j < limit; j++) {
                map.computeIfAbsent(chKey, k -> new ArrayList<>()).add(chVal);
                chVal++;
            }
        }
        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<>();
        helper(digits, 0, map, sb, result);
        return result;
    }

    private void helper(String digits, int index, Map<Character, List<Character>> map, StringBuilder sb,
            List<String> result) {
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }
        for (char ch : map.get(digits.charAt(index))) {
            sb.append(ch);
            helper(digits, index + 1, map, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}