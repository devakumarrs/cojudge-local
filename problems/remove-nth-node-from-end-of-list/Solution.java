/*
Definition for singly-linked list. 
ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
*/
class Solution {
    // [1,2,3,4,5]
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sent = new ListNode(0, head);
        ListNode slow = sent, fast = sent;
        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return sent.next;
    }
}