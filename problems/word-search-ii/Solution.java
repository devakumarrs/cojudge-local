import java.util.*;

class Solution {
    private class TrieNode {
        TrieNode[] children;

        public TrieNode() {
            children = new TrieNode[26];
        }
    };

    private TrieNode head;

    public List<String> findWords(char[][] board, String[] words) {
        head = new TrieNode();
        Arrays.sort(words, (s1, s2) -> {
            int len = Math.min(s1.length(), s2.length());
            for (int i = 0; i < len; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return s1.charAt(i) - s2.charAt(i);
                }
            }
            return s1.length() > s2.length() ? s2.length() - s1.length() : s1.length() - s2.length();
        });
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (found(word)) {
                result.add(word);
            } else if (found(board, word)) {
                add(word);
                result.add(word);
            }
        }
        return result;
    }

    private void add(String word) {
        TrieNode ptr = head;
        for (int i = 0; i < word.length(); i++) {
            if (ptr.children[word.charAt(i) - 'a'] == null) {
                ptr.children[word.charAt(i) - 'a'] = new TrieNode();
            }
            ptr = ptr.children[word.charAt(i) - 'a'];
        }
    }

    private boolean found(String word) {
        TrieNode ptr = head;
        for (int i = 0; i < word.length(); i++) {
            if (ptr.children[word.charAt(i) - 'a'] == null) {
                return false;
            }
            ptr = ptr.children[word.charAt(i) - 'a'];
        }
        return true;
    }

    private boolean found(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (word.charAt(0) == board[i][j] && found(board, word, i, j, m, n, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean found(char[][] board, String word, int i, int j, int m, int n, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != word.charAt(index)) {
            return false;
        }
        char ch = board[i][j];
        board[i][j] = '#';
        boolean exists = found(board, word, i + 1, j, m, n, index + 1) || found(board, word, i - 1, j, m, n, index + 1)
                || found(board, word, i, j - 1, m, n, index + 1) || found(board, word, i, j + 1, m, n, index + 1);
        board[i][j] = ch;
        return exists;
    }
}