/*
Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
    head = [1,2,3,4,5], k = 2
*/
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        var sent = new ListNode(0, head);
        var ptr = sent;
        while (ptr != null && ptr.next != null) {
            var start = ptr;
            var end = ptr.next;
            for (int i = 0; i < k && start != null; i++) {
                start = start.next;
            }
            if (start != null) {
                var link = start.next;
                start.next = null;
                ptr.next = reverse(ptr.next);
                end.next = link;
            }
            ptr = end;
        }
        return sent.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head, fut = null;
        while (curr != null) {
            fut = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fut;
        }
        return prev;
    }
}