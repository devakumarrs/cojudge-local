import java.util.*;

class Solution {
    private class ListNode {
        ListNode prev;
        ListNode next;
        int key;
        int val;

        public ListNode(int key, int val) {
            this.key = key;
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    };

    private class LRUCache {
        int capacity;
        ListNode head;
        ListNode tail;
        Map<Integer, ListNode> map;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            map = new HashMap<>(capacity);
            head = new ListNode(0, 0);
            tail = new ListNode(0, 0);
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            if (!map.containsKey(key)) {
                return -1;
            }
            var node = map.get(key);
            unlink(node);
            moveToEnd(node);
            return node.val;
        }

        public void put(int key, int val) {
            if (map.containsKey(key)) {
                get(key);
                var node = map.get(key);
                node.val = val;
            } else {
                var node = new ListNode(key, val);
                map.put(key, node);
                moveToEnd(node);
            }
            if (map.size() > capacity) {
                map.remove(head.next.key);
                unlink(head.next);
            }
        }

        private void unlink(ListNode node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        private void moveToEnd(ListNode node) {
            node.next = tail;
            node.prev = tail.prev;
            tail.prev.next = node;
            tail.prev = node;
        }
    };

    public int[] runLruCache(String[] operations, int[][] args) {
        var cache = new LRUCache(args[0][0]);
        var result = new ArrayList<Integer>();
        for (int i = 1; i < args.length; i++) {
            int key = args[i][0];
            String op = operations[i];
            if (op.equals("get")) {
                result.add(cache.get(key));
            } else {
                int val = args[i][1];
                cache.put(key, val);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}