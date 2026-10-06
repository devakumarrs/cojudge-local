class WordDictionary {
    private class TrieNode {
        boolean isWord;
        TrieNode[] children;

        public TrieNode() {
            isWord = false;
            children = new TrieNode[26];
        }
    };

    private TrieNode head;

    public WordDictionary() {
        head = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = head;
        for (char ch : word.toCharArray()) {
            if (node.children[ch - 'a'] == null) {
                node.children[ch - 'a'] = new TrieNode();
            }
            node = node.children[ch - 'a'];
        }
        node.isWord = true;
    }

    public boolean search(String word) {
        return search(word, 0, head);
    }

    private boolean search(String word, int index, TrieNode head) {
        if (index == word.length()) {
            return head.isWord;
        }
        TrieNode node = head;
        for (int i = index; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == '.') {
                for (int j = 0; j < 26; j++) {
                    if (node.children[j] != null && search(word, i + 1, node.children[j])) {
                        return true;
                    }
                }
                return false;
            }
            if (node.children[ch - 'a'] == null) {
                return false;
            }
            node = node.children[ch - 'a'];
            if (i == word.length() - 1 && !node.isWord) {
                return false;
            }
        }
        return true;
    }
}