class Trie {
    private class TrieNode {
        boolean isWord;
        TrieNode[] children;

        public TrieNode() {
            isWord = false;
            children = new TrieNode[26];
        }
    };

    private TrieNode head;

    public Trie() {
        head = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = head;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (node.children[ch - 'a'] == null) {
                node.children[ch - 'a'] = new TrieNode();
            }
            node = node.children[ch - 'a'];
            if (i == word.length() - 1) {
                node.isWord = true;
            }
        }
    }

    public boolean search(String word) {
        return search(word, true);
    }

    public boolean startsWith(String prefix) {
        return search(prefix, false);
    }

    private boolean search(String text, boolean isWord) {
        TrieNode node = head;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (node.children[ch - 'a'] == null) {
                return false;
            }
            node = node.children[ch - 'a'];
            if (i == text.length() - 1) {
                if (isWord && !node.isWord) {
                    return false;
                }
            }
        }
        return true;
    }
}